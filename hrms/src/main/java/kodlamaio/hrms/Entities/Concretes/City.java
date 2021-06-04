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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "city")

public class City {

	@Id	
	@Column(name = "id")
	private int id;
	
	@Column(name = "city_name")
	private String cityName;
	
	@OneToMany(mappedBy = "city")
	private List<JobAdvertisements> advertisements;
	
}
