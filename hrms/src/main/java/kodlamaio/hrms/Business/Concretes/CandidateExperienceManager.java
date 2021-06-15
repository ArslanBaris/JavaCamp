package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.CandidateExperiencesService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.CandidateExperiencesDao;
import kodlamaio.hrms.Entities.Concretes.CandidateExperiences;

@Service
public class CandidateExperienceManager implements CandidateExperiencesService {

	private CandidateExperiencesDao candidateExperiencesDao;
	
	@Autowired
	public CandidateExperienceManager(CandidateExperiencesDao candidateExperiencesDao) {
		super();
		this.candidateExperiencesDao = candidateExperiencesDao;
	}

	@Override
	public Result add(CandidateExperiences candidateExperience) {
		this.candidateExperiencesDao.save(candidateExperience);
	      return new SuccessResult("Data eklendi.");
	}

	@Override
	public Result addAll(List<CandidateExperiences> candidateExperience) {
		candidateExperiencesDao.saveAll(candidateExperience);
	      return new SuccessResult("Datalar eklendi.");
	}

	@Override
	public DataResult<List<CandidateExperiences>> getAll() {
		return new SuccessDataResult<>(this.candidateExperiencesDao.findAll());
	}

	@Override
	public DataResult<List<CandidateExperiences>> getAllByCandidateIdOrderByLeaveDate(int candidateId) {
		return new SuccessDataResult<>(this.candidateExperiencesDao.getAllByCandidateIdOrderByLeaveDateDesc(candidateId));
	}

}
