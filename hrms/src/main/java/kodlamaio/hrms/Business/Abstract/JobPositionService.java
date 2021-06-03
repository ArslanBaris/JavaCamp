package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Entities.Concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();
	
}