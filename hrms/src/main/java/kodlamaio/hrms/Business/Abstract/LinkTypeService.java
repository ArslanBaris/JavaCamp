package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.LinkTypes;

public interface LinkTypeService {

	  Result add(LinkTypes linkTypes);
	  DataResult<List<LinkTypes>> getAll();
}
