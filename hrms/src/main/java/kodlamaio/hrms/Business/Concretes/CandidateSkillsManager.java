package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.CandidateSkillsService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.CandidateSkillsDao;
import kodlamaio.hrms.Entities.Concretes.CandidateSkills;

@Service
public class CandidateSkillsManager implements CandidateSkillsService {

	private CandidateSkillsDao candidateSkillsDao;

	@Autowired
	public CandidateSkillsManager(CandidateSkillsDao candidateSkillsDao) {
		super();
		this.candidateSkillsDao = candidateSkillsDao;
	}

	@Override
	public Result add(CandidateSkills candidateSkills) {
		this.candidateSkillsDao.save(candidateSkills);
		return new SuccessResult("Data eklendi.");
	}

	@Override
	public Result addAll(List<CandidateSkills> candidateSkill) {
		candidateSkillsDao.saveAll(candidateSkill);
	      return new SuccessResult("Datalar eklendi.");
	}

	@Override
	public DataResult<List<CandidateSkills>> getAll() {
		 return new SuccessDataResult<>(this.candidateSkillsDao.findAll());
	}

	@Override
	public DataResult<List<CandidateSkills>> getAllByCandidateId(int candidateId) {
		return new SuccessDataResult<>(this.candidateSkillsDao.getAllByCandidateId(candidateId));
	}

}
