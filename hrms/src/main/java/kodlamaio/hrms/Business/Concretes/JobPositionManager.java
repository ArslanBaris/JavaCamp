package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.JobPositionService;
import kodlamaio.hrms.DataAccess.Abstract.JobPositionDao;
import kodlamaio.hrms.Entities.Concretes.JobPosition;

@Service 
public class JobPositionManager implements JobPositionService {

	private JobPositionDao  jobPositionDao;
	
	@Autowired	
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findAll();
	}
	
	
}
