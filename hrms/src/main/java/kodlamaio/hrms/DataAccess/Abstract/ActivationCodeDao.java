package kodlamaio.hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.ActivationCode;

public interface ActivationCodeDao extends JpaRepository<ActivationCode, Integer> {
	
	ActivationCode findByActivationCode(String activation_code);
	
}