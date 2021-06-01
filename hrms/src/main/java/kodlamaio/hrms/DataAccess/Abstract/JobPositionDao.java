package kodlamaio.hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.JobPosition;

												// <Entity,PrimaryKeyValueType>
public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

	JobPosition getByTitle(String name);
}
