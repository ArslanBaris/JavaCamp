package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.CandidateSchool;

public interface CandidateSchoolService {

	 Result add(CandidateSchool candidateSchool);
	 DataResult<List<CandidateSchool>> getAll();
	 Result addAll(List<CandidateSchool> candidateSchools);
	 DataResult<List<CandidateSchool>> getAllByCandidatesIdOrderByEndedDate(int candidateId);
	 
}
