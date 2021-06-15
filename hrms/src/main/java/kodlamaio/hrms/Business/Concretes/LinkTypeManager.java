package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.LinkTypeService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.LinkTypeDao;
import kodlamaio.hrms.Entities.Concretes.LinkTypes;

@Service
public class LinkTypeManager implements LinkTypeService {

	private LinkTypeDao linkTypeDao;

	@Autowired
	public LinkTypeManager(LinkTypeDao linkTypeDao) {
		super();
		this.linkTypeDao = linkTypeDao;
	}

	@Override
	public Result add(LinkTypes linkTypes) {
		this.linkTypeDao.save(linkTypes);
		return new SuccessResult("Data eklendi.");
	}

	@Override
	public DataResult<List<LinkTypes>> getAll() {
		return new SuccessDataResult<List<LinkTypes>>(this.linkTypeDao.findAll());
	}

}
