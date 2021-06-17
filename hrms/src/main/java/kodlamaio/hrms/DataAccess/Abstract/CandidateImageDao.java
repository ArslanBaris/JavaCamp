package kodlamaio.hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.Entities.Concretes.CandidateImage;

public interface CandidateImageDao extends JpaRepository<CandidateImage, Integer> {

	  List<CandidateImage> getAllByCandidateId(int candidateId);
	  List<CandidateImage> getByCandidateId(int candidateId);
}
