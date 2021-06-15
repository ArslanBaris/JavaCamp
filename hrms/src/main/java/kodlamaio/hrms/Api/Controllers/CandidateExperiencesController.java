package kodlamaio.hrms.Api.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.Abstract.CandidateExperiencesService;
import kodlamaio.hrms.Entities.Concretes.CandidateExperiences;

@RestController
@RequestMapping("/api/candidateExperiences")
public class CandidateExperiencesController {

	private CandidateExperiencesService candidateExperiencesService;

	@Autowired
	public CandidateExperiencesController(CandidateExperiencesService candidateExperiencesService) {
		super();
		this.candidateExperiencesService = candidateExperiencesService;
	}
	
	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody @Valid CandidateExperiences candidateExperiences){
        return ResponseEntity.ok(this.candidateExperiencesService.add(candidateExperiences));
    }


    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.candidateExperiencesService.getAll());
    }
}
