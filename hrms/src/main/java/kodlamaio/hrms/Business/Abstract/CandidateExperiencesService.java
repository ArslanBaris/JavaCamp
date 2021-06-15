package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.CandidateExperiences;

public interface CandidateExperiencesService {

	Result add(CandidateExperiences candidateExperience);

	Result addAll(List<CandidateExperiences> candidateExperience);

	DataResult<List<CandidateExperiences>> getAll();

	DataResult<List<CandidateExperiences>> getAllByCandidateIdOrderByLeaveDate(int candidateId);
}
