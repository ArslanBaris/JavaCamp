package kodlamaio.hrms.Business.Concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.ActivationCodeService;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.ActivationCodeDao;
import kodlamaio.hrms.Entities.Concretes.ActivationCode;


@Service
public class ActivationCodeManager implements ActivationCodeService{
	
	private ActivationCodeDao activationCodeDao;
	
	@Autowired
    public ActivationCodeManager(ActivationCodeDao activationCodeDao) {
        this.activationCodeDao = activationCodeDao;
	}
	

	@Override
	public Result add(ActivationCode code) {
		this.activationCodeDao.save(code);
		System.out.println("kod eklendi");
		return new SuccessResult("Kod kayıt edildi!");
	}


	@Override
	public Result sendActivationCode(ActivationCode activationCode,String emailAddress) {
	
		    String code= activationCode.getActivationCode();
			String message=emailAddress +"Verification code sent to address . Verification code:" + code ;
			System.out.println("kod gönderildi");
			return new Result(true, message);
	}
	
	

	
	
	
	
}