package kodlamaio.hrms.Entities.Concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_advertisements")

public class JobAdvertisements {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@NotNull
	@Column(name = "job_detail")
	private String jobDetail;
	
	@Column(name = "min_salary")
	private double minSalary;
	
	@Column(name = "max_salary")
	private double maxSalary;
	
	@NotNull
	@Column(name = "position_quota")
	private int positionQuota;
	
	@Column(name = "application_deadline")
	private Date applicationDeadline;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "job_list_date")
	private Date jobListDate;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employers employer;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "job_title_id")
	private JobPosition jobPosition;
	
}
