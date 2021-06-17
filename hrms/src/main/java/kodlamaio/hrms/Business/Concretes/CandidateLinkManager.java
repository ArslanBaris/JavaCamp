package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.CandidateLinksService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.CandidateLinksDao;
import kodlamaio.hrms.Entities.Concretes.CandidateLinks;

@Service
public class CandidateLinkManager implements CandidateLinksService {

	private CandidateLinksDao candidateLinksDao;
	
	@Autowired
	public CandidateLinkManager(CandidateLinksDao candidateLinksDao) {
		super();
		this.candidateLinksDao = candidateLinksDao;
	}

	@Override
	public Result add(CandidateLinks candidateLinks) {
		 this.candidateLinksDao.save(candidateLinks);
	      return new SuccessResult("Data eklendi.");
	}

	@Override
	public Result addAll(List<CandidateLinks> candidateLinks) {
		candidateLinksDao.saveAll(candidateLinks);
	      return new SuccessResult("Datalar eklendi.");
	}

	@Override
	public DataResult<List<CandidateLinks>> getAll() {
		return new SuccessDataResult<>(this.candidateLinksDao.findAll());
	}

	@Override
	public DataResult<List<CandidateLinks>> getAllByCandidateId(int candidateId) {
		return new SuccessDataResult<>(this.candidateLinksDao.getAllByCandidateId(candidateId));
	}

}
