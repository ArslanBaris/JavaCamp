package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.CandidateLinks;

public interface CandidateLinksService {

	Result add(CandidateLinks candidateLinks);
    Result addAll(List<CandidateLinks> candidateLinks);
    DataResult<List<CandidateLinks>> getAll();
    DataResult<List<CandidateLinks>> getAllByCandidateId(int candidateId);
}
