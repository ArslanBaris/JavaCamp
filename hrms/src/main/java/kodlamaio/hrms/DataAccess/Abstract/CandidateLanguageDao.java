package kodlamaio.hrms.DataAccess.Abstract;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.CandidateLanguage;

public interface CandidateLanguageDao extends JpaRepository<CandidateLanguage, Integer> {

	   List<CandidateLanguage> getAllByCandidateId(int candidateId);
		List<CandidateLanguage> getByCandidateId(int candidateId);
}
