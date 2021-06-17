package kodlamaio.hrms.Configuration;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.Core.Utilities.ImageService.ImageService;
import kodlamaio.hrms.Core.Utilities.ImageService.Cloudinary.CloudinaryImageManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public Cloudinary cloudinaryService(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dgfimpyp9",
                "api_key", "559497441591421",
                "api_secret", "qXZGvlycICDV5FBK3b4KEO0Oz4M"));
    }

    @Bean
    public ImageService imageService(){
        return new CloudinaryImageManager(cloudinaryService());
    }
}