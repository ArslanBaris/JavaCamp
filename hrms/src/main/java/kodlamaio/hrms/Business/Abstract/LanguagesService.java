package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.Languages;

public interface LanguagesService {

	  Result add(Languages language);
	  DataResult<List<Languages>> getAll();
}
