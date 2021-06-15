package kodlamaio.hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.Skills;

public interface SkillsDao extends JpaRepository<Skills, Integer>{

}
