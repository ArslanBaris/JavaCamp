package kodlamaio.hrms.Business.Concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.ActivationCodeService;
import kodlamaio.hrms.Business.Abstract.AuthService;
import kodlamaio.hrms.Business.Abstract.CandidatesService;
import kodlamaio.hrms.Business.Abstract.EmployersService;
import kodlamaio.hrms.Business.Abstract.UserService;
import kodlamaio.hrms.Core.Utilities.Adapter.MernisAdapterService;
import kodlamaio.hrms.Core.Utilities.Bussiness.BusinessRules;
import kodlamaio.hrms.Core.Utilities.Results.ErrorResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.CandidatesDao;
import kodlamaio.hrms.Entities.Concretes.Candidates;
import kodlamaio.hrms.Entities.Concretes.Employers;

import java.util.Date;
import java.util.regex.Pattern;

@Service
public class AuthManager implements AuthService {

	private EmployersService employerService;
	private UserService userService;
	private CandidatesService candidateService;
	private ActivationCodeService activationCodeService;
	private MernisAdapterService mernisCheckService;;

	public AuthManager(UserService userService, EmployersService employerService, CandidatesService candidateService,
			ActivationCodeService activationCodeService) {
		super();
		this.userService = userService;
		this.employerService = employerService;
		this.candidateService = candidateService;
		this.activationCodeService = activationCodeService;
		this.mernisCheckService = mernisCheckService;
	}

	@Override
	public Result registerEmployer(Employers employer, String confirmPassword) {
		if (!isValidEmail(employer.getEmail())) {
			return new ErrorResult("Invalid email address. Please enter your email address correctly.");
		}

		else if (!cheackIfEmailExist(employer.getEmail())) {
			return new ErrorResult("This mail is registered in the system.Please enter a different email address.");
		}

		else if (employer.getPassword() != confirmPassword) {
			System.out.println(employer.getPassword());
			System.out.println(confirmPassword);

			return new ErrorResult("Password does not match. Please re-enter your password.");
		}

		var result = this.employerService.addEmployer(employer);

		if (result.isSuccess()) {
			if (this.activationCodeService.sendActivationCode(employer.getEmail())) {
				return new SuccessResult("Employer Registered.");
			}
		}

		return new ErrorResult();

	}

	private boolean cheackIfEmailExist(String email) {
		if (this.userService.getUsersByEmail(email).getData() == null) {
			return true;
		}
		return false;
	}

	@Override
	public Result registerCandidate(Candidates candidate, String confirmPassword) {
		Result result = BusinessRules.run(
				fakeMernisControl(candidate.getNationalIdentity(), candidate.getFirstName(), 
						candidate.getLastName(),
						candidate.getDateOfBirth()),
				isNationaltyIdExist(candidate.getNationalIdentity()), 
				//this.userService.getUsersByEmail(candidate.getEmail())
				isCandidateMailExist(candidate.getEmail()));
		
		if (result != null) {
			return result;
		}
		
		this.candidateService.add(candidate);
		//String code = activationCodeService.sendActivationCode(candidate.getEmail());
		//verificationCodeForEmployees(code, 0, employee.getMail(), employee.getId());

		return new SuccessResult("Kayıt başarıyla tamamlandı.");
	}

	public boolean isValidEmail(String email) {
		String emailRegex = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{3}\\b";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	private Result fakeMernisControl(String nationalityId, String firstName, String lastName, Date birthday) {

		if (this.mernisCheckService.checkVirtualPerson(nationalityId, firstName, lastName, birthday).isSuccess()) {
			return new SuccessResult();
		}
		return new ErrorResult("Doğrulama başarısız.");
	}
	
    private Result isNationaltyIdExist(String nationalityId) {
		if (this.candidateService.isNationalityIdExist(nationalityId).isSuccess()) {
			
			return new SuccessResult();
			}
			return new ErrorResult("Bu Tc kimlik no ile kayıtlı kullanıcı var.");
		}
    private Result isCandidateMailExist(String mail) {

		if (this.candidateService.isCandidatesEmailExist(mail).isSuccess()) {
			return new SuccessResult();

		} else {
			return new ErrorResult("Bu mail ile kayıtlı kullanıcı var.");
		}

	}
    

	
}
