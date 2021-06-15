package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.SkillsService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.SkillsDao;
import kodlamaio.hrms.Entities.Concretes.Skills;

@Service
public class SkillsManager implements SkillsService {

	private SkillsDao skillsDao;

	@Autowired
	public SkillsManager(SkillsDao skillsDao) {
		super();
		this.skillsDao = skillsDao;
	}

	@Override
	public Result add(Skills skills) {
		this.skillsDao.save(skills);
		return new SuccessResult("Data eklendi.");
	}

	@Override
	public DataResult<List<Skills>> getAll() {
		return new SuccessDataResult<List<Skills>>(this.skillsDao.findAll());
	}

}
