package kodlamaio.hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.CandidateExperiences;
import kodlamaio.hrms.Entities.Concretes.CandidateLanguage;

public interface CandidateExperiencesDao extends JpaRepository<CandidateExperiences, Integer> {

	List<CandidateExperiences> getByCandidateId(int candidateId);
	 List<CandidateExperiences> getAllByCandidateIdOrderByLeaveDateDesc(int candidateId);
}
