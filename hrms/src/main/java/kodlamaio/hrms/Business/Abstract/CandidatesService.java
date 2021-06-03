package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.Candidates;

public interface CandidatesService {

	DataResult<List<Candidates>> getAll();
	Result add(Candidates candidates);
	Result isNationalityIdExist(String nationalityId);
	Result isCandidatesEmailExist(String mail);
}
