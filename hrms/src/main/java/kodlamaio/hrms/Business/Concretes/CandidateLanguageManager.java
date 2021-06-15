package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.CandidateLanguageService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.CandidateLanguageDao;
import kodlamaio.hrms.Entities.Concretes.CandidateLanguage;

@Service
public class CandidateLanguageManager implements CandidateLanguageService{

	private CandidateLanguageDao candidateLanguageDao;
    
	public CandidateLanguageManager(CandidateLanguageDao candidateLanguageDao) {
		super();
		this.candidateLanguageDao = candidateLanguageDao;
	}

	@Override
	public Result add(CandidateLanguage candidateLanguage) {
		  this.candidateLanguageDao.save(candidateLanguage);
	      return new SuccessResult("Data eklendi.");
	}

	@Override
	public Result addAll(List<CandidateLanguage> candidateLanguage) {
		  candidateLanguageDao.saveAll(candidateLanguage);
	      return new SuccessResult("Datalar eklendi.");
	}

	@Override
	public DataResult<List<CandidateLanguage>> getAll() {
		  return new SuccessDataResult<>(this.candidateLanguageDao.findAll());
	}

	@Override
	public DataResult<List<CandidateLanguage>> getAllByCandidateId(int candidateId) {
		return new SuccessDataResult<>(this.candidateLanguageDao.getAllByCandidateId(candidateId));
	}

}
