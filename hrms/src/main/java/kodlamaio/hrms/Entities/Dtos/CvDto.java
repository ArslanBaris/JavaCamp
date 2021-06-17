package kodlamaio.hrms.Entities.Dtos;
import java.util.List;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonIgnore;

import kodlamaio.hrms.Entities.Abstract.Dto;
import kodlamaio.hrms.Entities.Concretes.CandidateExperiences;
import kodlamaio.hrms.Entities.Concretes.CandidateImage;
import kodlamaio.hrms.Entities.Concretes.CandidateLanguage;
import kodlamaio.hrms.Entities.Concretes.CandidateLinks;
import kodlamaio.hrms.Entities.Concretes.CandidateSchool;
import kodlamaio.hrms.Entities.Concretes.CandidateSkills;
import kodlamaio.hrms.Entities.Concretes.Candidates;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvDto implements Dto {

	 @JsonIgnore
	 private Candidates candidate;
	 private List<@Valid CandidateSchool> candidateSchools;
	 private List<@Valid CandidateLanguage> candidateLanguages;
	 private List<@Valid CandidateSkills> candidateSkills;
	 private List<@Valid CandidateLinks> candidateLinks;
	 private List<@Valid CandidateExperiences> candidateExperiences;
	 private List<@Valid CandidateImage> candidateImages;
}
