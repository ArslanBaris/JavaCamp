package kodlamaio.hrms.Business.Abstract;

import org.springframework.web.bind.annotation.RequestBody;

import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.ActivationCode;
import kodlamaio.hrms.Entities.Concretes.Candidates;
import kodlamaio.hrms.Entities.Concretes.Employers;

public interface AuthService {

	Result registerEmployer(Employers employer,String confirmPassword);
	Result registerCandidate(Candidates candidate ,String confirmPassword);
	
}
