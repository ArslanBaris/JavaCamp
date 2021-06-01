package kodlamaio.hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.Candidates;


public interface CandidatesDao extends JpaRepository<Candidates, Integer>{

	Candidates getByEmail(String email);
	List<Candidates> findByNationalIdentityContaining(String nationalityId);
	List<Candidates> findByEmailContaining(String mail);
}
