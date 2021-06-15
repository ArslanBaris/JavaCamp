package kodlamaio.hrms.DataAccess.Abstract;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import kodlamaio.hrms.Entities.Concretes.Department;


public interface DepartmentDao extends JpaRepository<Department, Integer> {

	@Query("From Department where id=:departmentId and university.id=:universityId and faculty.id=:facultyId") 
	Department  getByDepartmentId(int departmentId,int universityId, int facultyId);
	
}
