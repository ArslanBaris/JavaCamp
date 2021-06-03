package kodlamaio.hrms.Api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.Abstract.AuthService;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.Candidates;
import kodlamaio.hrms.Entities.Concretes.Employers;

@RestController
@RequestMapping("/api/auth")
public class AuthController {


	private AuthService authService;

	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmployer(@RequestBody Employers employer,String confirmPassword) {
		return this.authService.registerEmployer(employer, confirmPassword);
	}
	

	@PostMapping("/registerCandidate")
	public Result registerCandidate(@RequestBody Candidates candidate ,String confirmPassword) {
		return this.authService.registerCandidate (candidate, confirmPassword);
	}
}
