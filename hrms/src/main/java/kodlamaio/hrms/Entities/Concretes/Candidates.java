package kodlamaio.hrms.Entities.Concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "candidatesid")
@EqualsAndHashCode(callSuper=false)  //
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","CandidateSchool"})
public class Candidates extends Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "candidatesid")
	private int id;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "nationalidentity")
	private String nationalIdentity;
	
	@Column(name = "dateofbirth")
	private Date dateOfBirth;
	
    @Column(name = "description")
    private String description;
    
    @OneToMany(mappedBy = "candidate")
    @JsonIgnore
    private List<CandidateSchool> candidateSchool;
    
    @OneToMany(mappedBy = "candidate")
    private List<CandidateImage> candidateImages;

    @OneToMany(mappedBy = "candidate")
    @JsonIgnore
    private List<CandidateExperiences> candidateExperiences;

    @OneToMany(mappedBy = "candidate")
    @JsonIgnore
    private List<CandidateLanguage> candidateLanguages;

    @OneToMany(mappedBy = "candidate")
    @JsonIgnore
    private List<CandidateLinks> candidateLinks;

    @OneToMany(mappedBy = "candidate")
    @JsonIgnore
    private List<CandidateSkills> candidateSkills;
    
    
	
}