package kodlamaio.hrms.Business.Abstract;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Dtos.CvDto;

public interface CvDtoService {

	  Result add(CvDto cvDto,int candidateId);
	  DataResult<CvDto> getCVByCandidate(int candidateId);
}
