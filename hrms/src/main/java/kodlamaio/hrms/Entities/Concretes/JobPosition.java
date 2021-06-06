package kodlamaio.hrms.Entities.Concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_positions")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_adversitements"})
public class JobPosition {
	
	@Id //PrimaryKey
	@GeneratedValue(strategy=GenerationType.IDENTITY) //AutoIncrement 
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvertisements> jobAdvertisements;

	public JobPosition( String title, List<JobAdvertisements> jobAdvertisements) {
		super();
		this.title = title;
		this.jobAdvertisements = jobAdvertisements;
	}
	
	
	
}