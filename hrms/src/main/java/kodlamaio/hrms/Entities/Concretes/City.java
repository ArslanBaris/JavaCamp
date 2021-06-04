package kodlamaio.hrms.Entities.Concretes;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "city")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisements"})

public class City {

	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY) //AutoIncrement 
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "city_name")
	private String cityName;
	
	@OneToMany(mappedBy = "city")
	private List<JobAdvertisements> advertisements;

	public City( String cityName, List<JobAdvertisements> advertisements) {
		super();
		this.cityName = cityName;
		this.advertisements = advertisements;
	}
	
	
}
