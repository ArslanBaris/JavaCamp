package kodlamaio.hrms.Business.Abstract;

import java.util.List;


import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.Employers;


public interface EmployersService {

	DataResult<List<Employers>> getAll();
	Result addEmployer(Employers employer);
}
