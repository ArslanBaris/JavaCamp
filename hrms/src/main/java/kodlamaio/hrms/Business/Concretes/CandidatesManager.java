package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.CandidatesService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.ErrorResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.CandidatesDao;
import kodlamaio.hrms.Entities.Concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;
	
	public CandidatesManager(CandidatesDao candidatesDao) {
		this.candidatesDao=candidatesDao;
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>(this.candidatesDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Candidates candidates) {
		return new SuccessDataResult<Candidates>
		(this.candidatesDao.save(candidates),"Data Listelendi");
	}
	
	@Override
	public Result isNationalityIdExist(String nationalityId) {

		if (candidatesDao.findByNationalIdentityContaining(nationalityId).isEmpty()) {
			return new SuccessResult();

		} else {
			return new ErrorResult("Bu Tc kimlik no ile kayıtlı kullanıcı var.");
		}
	}

	@Override
	public Result isCandidatesEmailExist(String mail) {
		if (candidatesDao.findByEmailContaining(mail).isEmpty()) {
			return new SuccessResult();

		} else {
			return new ErrorResult("Bu mail ile kayıtlı kullanıcı var.");
		}
	}
	
	

}
