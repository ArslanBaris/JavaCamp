package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.CandidateImage;

public interface CandidateImageService {

	Result add(CandidateImage candidateImage);

	Result addAll(List<CandidateImage> candidateImages);

	Result add(CandidateImage candidateImage, MultipartFile file);

	DataResult<List<CandidateImage>> getAll();

	DataResult<List<CandidateImage>> getAllByCandidateId(int candidateId);
}
