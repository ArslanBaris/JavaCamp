package kodlamaio.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.CandidateSchoolService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.ErrorResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.CandidateSchoolDao;
import kodlamaio.hrms.DataAccess.Abstract.CandidatesDao;
import kodlamaio.hrms.DataAccess.Abstract.DepartmentDao;
import kodlamaio.hrms.Entities.Concretes.CandidateSchool;
import kodlamaio.hrms.Entities.Concretes.Candidates;
import kodlamaio.hrms.Entities.Concretes.Languages;

@Service
public class CandidateSchoolManager implements CandidateSchoolService {

	private CandidateSchoolDao candidateSchoolDao;
	private DepartmentDao departmentDao;
	private CandidatesDao candidatesDao;
	
	@Autowired
	public CandidateSchoolManager(CandidateSchoolDao candidateSchoolDao,DepartmentDao departmentDao,
			CandidatesDao candidatesDao) {
		super();
		this.candidateSchoolDao = candidateSchoolDao;
		this.departmentDao = departmentDao;
		this.candidatesDao = candidatesDao;
	}

	@Override
	public Result add(CandidateSchool candidateSchool) {
		if(this.departmentDao.getByDepartmentId(candidateSchool.getDepartment().getId(),
				candidateSchool.getUniversity().getId(), 
				candidateSchool.getFaculty().getId())==null) {
			return new ErrorResult("Data boş.");
		}
		
		Candidates candidate = this.candidatesDao.getOne(candidateSchool.getCandidate().getId());
		if(!candidatesDao.findById(candidate.getId()).isPresent()) {
			return new ErrorResult("Kullanıcı bulunamadı.");
		}
			
		this.candidateSchoolDao.save(candidateSchool);
		return new SuccessResult("Data eklendi.");
		
	}

	@Override
	public DataResult<List<CandidateSchool>> getAll() {
		return new SuccessDataResult<List<CandidateSchool>>(this.candidateSchoolDao.findAll());
	}

	@Override
	public DataResult<List<CandidateSchool>> getAllByCandidatesIdOrderByEndedDate(int candidateId) {
		 return new SuccessDataResult<>(this.candidateSchoolDao.
				 getAllByCandidateIdOrderByEndedDate(candidateId), "Data sıralanarak listelendi.");
	}

	@Override
	public Result addAll(List<CandidateSchool> candidateSchools) {
		candidateSchoolDao.saveAll(candidateSchools);
	        return new SuccessResult("Data eklendi.");
	    
	}
	
	

	
	
}
