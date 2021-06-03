package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.EmployersService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.DataAccess.Abstract.EmployersDao;
import kodlamaio.hrms.Entities.Concretes.Employers;

@Service
public class EmployersManager implements EmployersService {
	
	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		this.employersDao=employersDao;
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>(this.employersDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result addEmployer(Employers employer) {
		return new SuccessDataResult<Employers>
		(this.employersDao.save(employer),"Data Listelendi");
	}

}
