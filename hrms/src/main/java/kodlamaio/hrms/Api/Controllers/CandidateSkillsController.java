package kodlamaio.hrms.Api.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.Business.Abstract.CandidateSkillsService;
import kodlamaio.hrms.Entities.Concretes.CandidateSkills;


@RestController
@RequestMapping("/api/candidateSkills")
public class CandidateSkillsController {

	private CandidateSkillsService candidateSkillsService;

	@Autowired
	public CandidateSkillsController(CandidateSkillsService candidateSkillsService) {
		super();
		this.candidateSkillsService = candidateSkillsService;
	}
	

	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody @Valid CandidateSkills candidateSkills){
        return ResponseEntity.ok(this.candidateSkillsService.add(candidateSkills));
    }


    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.candidateSkillsService.getAll());
    }
	
}
