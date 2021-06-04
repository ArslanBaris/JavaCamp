package kodlamaio.hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.JobAdvertisements;


public interface JobAdvertisementsDao extends JpaRepository<JobAdvertisements, Integer> {

	List<JobAdvertisements> findByIsActiveTrue();
	

	List<JobAdvertisements> findByIsActiveTrueOrderByJobListDateDesc();
	

	List<JobAdvertisements> findByIsActiveTrueAndEmployerId(int id);
}
