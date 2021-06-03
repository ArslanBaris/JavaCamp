package kodlamaio.hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.Abstract.EmployersService;
import kodlamaio.hrms.Business.Abstract.UserService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.Candidates;
import kodlamaio.hrms.Entities.Concretes.Employers;
import kodlamaio.hrms.Entities.Concretes.Users;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployersService employersService;
    
	@Autowired
	public EmployersController(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employers>> getAll(){
		return this.employersService.getAll();
	}
	
	@PostMapping("/add")
    public Result add(@RequestBody Employers employers ) {
    	return this.employersService.addEmployer(employers);
    }
	
	
	
}

