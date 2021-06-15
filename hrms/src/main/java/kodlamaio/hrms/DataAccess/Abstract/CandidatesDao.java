package kodlamaio.hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.Entities.Concretes.Candidates;


public interface CandidatesDao extends JpaRepository<Candidates, Integer>{

	Candidates getByEmail(String email);
	Candidates getById(int id);
	List<Candidates> findByNationalIdentity(String nationalityId);
	List<Candidates> findByEmail(String mail);
	
	
}
