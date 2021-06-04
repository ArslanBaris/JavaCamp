package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import kodlamaio.hrms.Business.Abstract.JobAdvertisementService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.JobAdvertisementsDao;
import kodlamaio.hrms.Entities.Concretes.JobAdvertisements;

public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementsDao jobAdvertisementsDao;
	
	
	public JobAdvertisementManager(JobAdvertisementsDao jobAdvertisementsDao) {
		super();
		this.jobAdvertisementsDao = jobAdvertisementsDao;
	}

	@Override
	public Result add(JobAdvertisements jobAdvertisements) {
		this.jobAdvertisementsDao.save(jobAdvertisements);
		return new SuccessResult("İş ilanı eklendi.");
	}

	@Override
	public Result update(JobAdvertisements jobAdvertisements) {
		this.jobAdvertisementsDao.save(jobAdvertisements);
		return new SuccessResult("İş ilanı güncellendi.");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertisementsDao.deleteById(id);
		return new SuccessResult("İş ilanı kaldırıldı.");
	}

	@Override
	public Result changeOpentoClose(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvertisements>> getByIsActive() {
		return new SuccessDataResult<List<JobAdvertisements>>(this.jobAdvertisementsDao.findByIsActiveTrue());
	}

	@Override
	public DataResult<List<JobAdvertisements>> getByIsActiveTrueOrderByJobListDateDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvertisements>> getByIsActiveTrueAndEmployerId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAdvertisements>> getAll() {
		return new SuccessDataResult<List<JobAdvertisements>>(this.jobAdvertisementsDao.findAll());
		
	}

}
