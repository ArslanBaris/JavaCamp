package kodlamaio.hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.Users;

public interface UserDao extends JpaRepository<Users, Integer>{
	Users findByEmail(String email);
}
