package kodlamaio.hrms.Business.Abstract;

import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.ActivationCode;


public interface ActivationCodeService {
	Result add(ActivationCode activationCode);
	boolean sendActivationCode(String emailAddress);

	
	
}