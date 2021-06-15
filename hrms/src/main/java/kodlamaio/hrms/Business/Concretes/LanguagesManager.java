package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.LanguagesService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.LanguagesDao;
import kodlamaio.hrms.Entities.Concretes.Languages;

@Service
public class LanguagesManager implements LanguagesService {

	private final LanguagesDao languagesDao;

    @Autowired
    public LanguagesManager(LanguagesDao languagesDao) {
        this.languagesDao = languagesDao;
    }
    
	@Override
	public Result add(Languages language) {
		  this.languagesDao.save(language);
	      return new SuccessResult("Data eklendi.");
	}

	@Override
	public DataResult<List<Languages>> getAll() {
		return new SuccessDataResult<List<Languages>>(this.languagesDao.findAll());
	}

}
