package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.JobAdvertisementService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.ErrorResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.JobAdvertisementsDao;
import kodlamaio.hrms.Entities.Concretes.JobAdvertisements;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementsDao jobAdvertisementsDao;
	
	@Autowired
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
	public Result changeToActive(int id) {
		if(getById(id) == null) {
			return new ErrorResult("Böyle bir iş ilanı yok!");
		}
		if (getById(id).getData().isActive() == false) {
			return new SuccessResult("İş ilani zaten kapalı!");
		
		}
		JobAdvertisements jobAdvertisements = getById(id).getData();
		jobAdvertisements.setActive(false);
		update(jobAdvertisements);
		return new SuccessResult("İş ilanı başarılı şekilde kapatıldı!");
	}

	@Override
	public DataResult<List<JobAdvertisements>> getByIsActive() {
		return new SuccessDataResult<List<JobAdvertisements>>(this.jobAdvertisementsDao.findByIsActiveTrue());
	}

	@Override
	public DataResult<List<JobAdvertisements>> getByIsActiveTrueOrderByApplicationDeadlineDesc() {
		return new SuccessDataResult<List<JobAdvertisements>>(this.jobAdvertisementsDao.findByIsActiveTrueOrderByApplicationDeadlineDesc());
	}

	@Override
	public DataResult<List<JobAdvertisements>> getByIsActiveTrueAndEmployerId(int id) {
		return new SuccessDataResult<List<JobAdvertisements>>(this.jobAdvertisementsDao.findByIsActiveTrueAndEmployerId(id));
	}

	@Override
	public DataResult<List<JobAdvertisements>> getAll() {
		return new SuccessDataResult<List<JobAdvertisements>>(this.jobAdvertisementsDao.findAll());
		
	}

	@Override
	public DataResult<JobAdvertisements> getById(int id) {
		return new SuccessDataResult<JobAdvertisements>(this.jobAdvertisementsDao.getOne(id));
	}

}
