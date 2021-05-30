package kodlamaio.hrms.Business.Concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.ActivationCodeService;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.ActivationCodeDao;
import kodlamaio.hrms.DataAccess.Abstract.UserDao;
import kodlamaio.hrms.Entities.Concretes.ActivationCode;
import kodlamaio.hrms.Entities.Concretes.Users;

@Service
public class ActivationCodeManager implements ActivationCodeService{
	
	private UserDao userDao;
	private ActivationCodeDao activationCodeDao;
	
	@Autowired
    public ActivationCodeManager(ActivationCodeDao activationCodeDao,UserDao userDao) {
        this.activationCodeDao = activationCodeDao;
        this.userDao=userDao;
	}

	@Override
	public ActivationCode getByCode(String code) {
		return this.activationCodeDao.findByActivationCode(code);
	}
	
	String code = "";
	@Override
	public String createActivationCode(Users user) {
		int randomCode = (int) (Math.random()*9999);
		code = String.valueOf(randomCode);
		
		ActivationCode activationCode=new ActivationCode();
        activationCode.setUserId(user.getId());
        activationCode.setActivationCode(code);
        activationCodeDao.save(activationCode);

		return code;
	}
	
	

	@Override
	public Result activateUser(String code) {
		 Users users = userDao.getOne(activationCodeDao.findByActivationCode(code).getUserId());
	        userDao.save(users);
	        return new SuccessResult("Kullanıcı aktif edildi");
	}
	
	
}