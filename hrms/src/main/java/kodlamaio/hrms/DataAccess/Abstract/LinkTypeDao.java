package kodlamaio.hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.LinkTypes;

public interface LinkTypeDao extends JpaRepository<LinkTypes, Integer> {

}
