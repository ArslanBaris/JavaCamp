package kodlamaio.hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.CandidateSkills;

public interface CandidateSkillsDao extends JpaRepository<CandidateSkills, Integer>  {

	 List<CandidateSkills> getAllByCandidateId(int candidateId);
	 List<CandidateSkills> getByCandidateId(int candidateId);
}
