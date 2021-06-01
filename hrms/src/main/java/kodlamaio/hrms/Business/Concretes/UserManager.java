package kodlamaio.hrms.Business.Concretes;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.UserService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.UserDao;
import kodlamaio.hrms.Entities.Concretes.Users;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public DataResult<List<Users>> getAll() {		
		return new SuccessDataResult<List<Users>>(this.userDao.findAll());
	}

	@Override
	public Result addUsers(Users users) {
		this.userDao.save(users);
		return new SuccessResult("Kişi eklendi");
	}

	@Override
	public DataResult<Users> getUsersByEmail(String email) {
		return new SuccessDataResult<Users>(this.userDao.findUsersByEmail(email));
		
	}
	
	
	
	

}