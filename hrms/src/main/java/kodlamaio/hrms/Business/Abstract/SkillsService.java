package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.Skills;

public interface SkillsService {

	Result add(Skills skills);

	DataResult<List<Skills>> getAll();
}
