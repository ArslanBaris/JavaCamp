package kodlamaio.hrms.DataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.CandidateLinks;

public interface CandidateLinksDao  extends JpaRepository<CandidateLinks, Integer>{

	List<CandidateLinks> getAllByCandidateId(int candidateId);
	List<CandidateLinks> getByCandidateId(int candidateId);
}
