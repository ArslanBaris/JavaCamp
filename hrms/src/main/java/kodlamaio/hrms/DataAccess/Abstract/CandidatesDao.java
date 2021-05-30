package kodlamaio.hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.Candidates;


public interface CandidatesDao extends JpaRepository<Candidates, Integer>{

}
