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
		return new SuccessResult("Kod kayıt edildi!");
	}


	@Override
	public boolean sendActivationCode(String emailAddress) {
	
		    String code= createActivationCode();
			System.out.println(emailAddress +"Verification code sent to address . Verification code:" + code );
			return true;
	}
	
	String code = "";
	public String createActivationCode() {
		int randomCode = (int) (Math.random()*9999);
		code = String.valueOf(randomCode);
		return code;
	}

	
	
	
	
}