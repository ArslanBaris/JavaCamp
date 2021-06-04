package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.JobAdvertisements;

public interface JobAdvertisementService {

	Result add(JobAdvertisements jobAdvertisements);
	
	Result update(JobAdvertisements jobAdvertisements);
	
	Result delete(int id);
	
	Result changeOpentoClose(int id);

	DataResult<List<JobAdvertisements>> getAll();
	
	DataResult<List<JobAdvertisements>> getByIsActive();
	
	DataResult<List<JobAdvertisements>> getByIsActiveTrueOrderByJobListDateDesc();
	
	DataResult<List<JobAdvertisements>> getByIsActiveTrueAndEmployerId(int id);
	
	
}
