package kodlamaio.hrms.Business.Concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.CandidateExperiencesService;
import kodlamaio.hrms.Business.Abstract.CandidateImageService;
import kodlamaio.hrms.Business.Abstract.CandidateLanguageService;
import kodlamaio.hrms.Business.Abstract.CandidateLinksService;
import kodlamaio.hrms.Business.Abstract.CandidateSchoolService;
import kodlamaio.hrms.Business.Abstract.CandidateSkillsService;
import kodlamaio.hrms.Business.Abstract.CvDtoService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessDataResult;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.DataAccess.Abstract.CandidateExperiencesDao;
import kodlamaio.hrms.DataAccess.Abstract.CandidateImageDao;
import kodlamaio.hrms.DataAccess.Abstract.CandidateLanguageDao;
import kodlamaio.hrms.DataAccess.Abstract.CandidateLinksDao;
import kodlamaio.hrms.DataAccess.Abstract.CandidateSchoolDao;
import kodlamaio.hrms.DataAccess.Abstract.CandidateSkillsDao;
import kodlamaio.hrms.DataAccess.Abstract.CandidatesDao;
import kodlamaio.hrms.Entities.Concretes.Candidates;
import kodlamaio.hrms.Entities.Dtos.CvDto;

@Service
public class CvDtoManager implements CvDtoService {

	private CandidatesDao candidateDao;
	private CandidateSchoolDao  candidateSchoolDao;
	private CandidateSchoolService candidateSchoolService;
	private CandidateLanguageDao candidateLanguageDao;
	private CandidateLanguageService candidateLanguageService;
	private CandidateSkillsDao candidateSkillsDao;
	private CandidateSkillsService candidateSkillsService;
	private CandidateLinksDao candidateLinksDao;
	private CandidateLinksService candidateLinksService;
	private CandidateExperiencesDao candidateExperiencesDao;
	private CandidateExperiencesService candidateExperiencesService;
	private CandidateImageService candidateImageService;
	private CandidateImageDao candidateImageDao;
	
	
	@Autowired
	public CvDtoManager(CandidatesDao candidateDao, CandidateSchoolDao candidateSchoolDao, 
			CandidateSchoolService candidateSchoolService, CandidateLanguageService candidateLanguageService,
			CandidateLanguageDao candidateLanguageDao, CandidateSkillsDao candidateSkillsDao,
			CandidateSkillsService candidateSkillsService,CandidateLinksDao candidateLinksDao,
			CandidateLinksService candidateLinksService,CandidateExperiencesDao candidateExperiencesDao,
			CandidateExperiencesService candidateExperiencesService,CandidateImageService candidateImageService,
			CandidateImageDao candidateImageDao) {
		super();
		this.candidateDao = candidateDao;
		this.candidateSchoolDao = candidateSchoolDao;
		this.candidateSchoolService = candidateSchoolService;
		this.candidateLanguageService = candidateLanguageService;
		this.candidateLanguageDao = candidateLanguageDao;
		this.candidateSkillsDao = candidateSkillsDao;
		this.candidateSkillsService = candidateSkillsService;
		this.candidateLinksDao = candidateLinksDao;
		this.candidateLinksService = candidateLinksService;
		this.candidateExperiencesDao = candidateExperiencesDao;
		this.candidateExperiencesService = candidateExperiencesService;
		this.candidateImageDao = candidateImageDao;
		this.candidateImageService = candidateImageService;
	}

	@Override
	public Result add(CvDto cvDto, int candidateId) {
		Candidates candidate = this.candidateDao.findById(candidateId).get();
        cvDto.setCandidate(candidate);

        cvDto.getCandidateSchools().forEach(candidateSchool -> candidateSchool.setCandidate(candidate));
        candidateSchoolService.addAll(cvDto.getCandidateSchools());
        
        cvDto.getCandidateLanguages().forEach(candidateLanguage -> candidateLanguage.setCandidate(candidate));
        candidateLanguageService.addAll(cvDto.getCandidateLanguages());
        
        cvDto.getCandidateSkills().forEach(candidateSkills -> candidateSkills.setCandidate(candidate));
        candidateSkillsService.addAll(cvDto.getCandidateSkills());
        
        cvDto.getCandidateLinks().forEach(candidateLinks -> candidateLinks.setCandidate(candidate));
        candidateLinksService.addAll(cvDto.getCandidateLinks());
      
        cvDto.getCandidateExperiences().forEach(candidateExperiences -> candidateExperiences.setCandidate(candidate));
        candidateExperiencesService.addAll(cvDto.getCandidateExperiences());
        
        cvDto.getCandidateImages().forEach(candidateImage -> candidateImage.setCandidate(candidate));
        candidateImageService.addAll(cvDto.getCandidateImages());
        
        
        return new SuccessResult("Okullar ve Diller Cv'ye eklendi.");
	}

	@Override
	public DataResult<CvDto> getCVByCandidate(int candidateId) {
		CvDto cvDto = new CvDto();
		cvDto.setCandidate(this.candidateDao.getById(candidateId));
		cvDto.setCandidateSchools(this.candidateSchoolDao.getAllByCandidateIdOrderByEndedDate(candidateId));
		cvDto.setCandidateLanguages(this.candidateLanguageDao.getByCandidateId(candidateId));
		cvDto.setCandidateSkills(this.candidateSkillsDao.getByCandidateId(candidateId));
		cvDto.setCandidateLinks(this.candidateLinksDao.getByCandidateId(candidateId));
		cvDto.setCandidateExperiences(this.candidateExperiencesDao.getAllByCandidateIdOrderByLeaveDateDesc(candidateId));
		cvDto.setCandidateImages(this.candidateImageDao.getByCandidateId(candidateId));
	

		return new SuccessDataResult<CvDto>(cvDto);
	}

}
