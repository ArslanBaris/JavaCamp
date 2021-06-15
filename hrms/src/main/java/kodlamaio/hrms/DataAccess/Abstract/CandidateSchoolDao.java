package kodlamaio.hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.CandidateSchool;



public interface CandidateSchoolDao extends JpaRepository<CandidateSchool, Integer> {

	List<CandidateSchool> getByCandidateId(int candidateId);
	List<CandidateSchool> getAllByCandidateIdOrderByEndedDate(int candidateId);
}
