package kodlamaio.hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.Abstract.JobPositionService;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.JobPosition;


@RestController 
@RequestMapping("/api/jobpositions") //
public class JobPositionsController {
	
	private JobPositionService jobPositionService;

	@Autowired 
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return jobPositionService.getAll();
	}
	
	
	
}
