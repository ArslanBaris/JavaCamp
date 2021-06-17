package kodlamaio.hrms.Core.Utilities.ImageService.Cloudinary;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.Core.Utilities.ImageService.ImageService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.ErrorDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;

public class CloudinaryImageManager implements ImageService {

	 private final Cloudinary cloudinary;

	    @Autowired
	    public CloudinaryImageManager(Cloudinary cloudinary) {
	        this.cloudinary = cloudinary;
	    }

	    @Override
	    public DataResult<?> save(MultipartFile file) {
	        try{
	            Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
	            return new SuccessDataResult<Map>(uploadResult);
	        } catch (IOException e){
	            e.printStackTrace();
	        }
	        return new ErrorDataResult<Map>();
	    }

		
}
