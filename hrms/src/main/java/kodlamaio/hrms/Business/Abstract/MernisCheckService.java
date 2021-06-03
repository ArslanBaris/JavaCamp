package kodlamaio.hrms.Business.Abstract;

import java.util.Date;

import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.Candidates;

public interface MernisCheckService {

	//Result checkRealPerson(Candidates candidates);
	
	boolean checkVirtualPerson(String nationalityId,String firstName,String lastName,Date birthday);
}
