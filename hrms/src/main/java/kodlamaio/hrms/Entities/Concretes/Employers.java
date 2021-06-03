package kodlamaio.hrms.Entities.Concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "employersid")
@EqualsAndHashCode(callSuper=true)

public class Employers extends Users {

	@Column(name = "companyname")
	private String companyName;
	
	@Column(name = "webaddress")
	private String webAddress;
	
	@Column(name = "phonenumber")
	private String phoneNumber;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisements> jobAdversitements;
	
}