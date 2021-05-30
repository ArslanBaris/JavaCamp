package kodlamaio.hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.Employers;


public interface EmployersDao extends JpaRepository<Employers, Integer> {

}
