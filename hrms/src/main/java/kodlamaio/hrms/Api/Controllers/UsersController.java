package kodlamaio.hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.Abstract.EmployersService;
import kodlamaio.hrms.Business.Abstract.UserService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.Users;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Users>> getAll(){
		return this.userService.getAll();
	};
	
	@PostMapping("/add")
	public Result addUsers(Users users) {
		return this.userService.addUsers(users);
	}
}
