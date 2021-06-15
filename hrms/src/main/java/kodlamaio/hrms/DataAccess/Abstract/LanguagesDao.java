package kodlamaio.hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.Languages;

public interface LanguagesDao  extends JpaRepository<Languages, Integer>{

}
