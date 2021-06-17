package kodlamaio.hrms.Core.Utilities.ImageService;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;

public interface ImageService {

	 DataResult<?> save(MultipartFile file);
}
