package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.Users;


public interface UserService {
	
	DataResult<Users> getUsersByEmail(String email);
	DataResult<List<Users>> getAll();
	Result addUsers(Users users);
}
