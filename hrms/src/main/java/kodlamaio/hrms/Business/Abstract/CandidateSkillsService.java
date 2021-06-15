package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.CandidateSkills;

public interface CandidateSkillsService {

	Result add(CandidateSkills candidateSkills);

	Result addAll(List<CandidateSkills> candidateSkill);

	DataResult<List<CandidateSkills>> getAll();

	DataResult<List<CandidateSkills>> getAllByCandidateId(int candidateId);
}
