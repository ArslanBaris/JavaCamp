package kodlamaio.hrms.Api.Controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.Abstract.CandidateLinksService;
import kodlamaio.hrms.Entities.Concretes.CandidateLinks;

@RestController
@RequestMapping("/api/candidateLink")
public class CandidateLinkController {

	private CandidateLinksService candidateLinksService;

	public CandidateLinkController(CandidateLinksService candidateLinksService) {
		super();
		this.candidateLinksService = candidateLinksService;
	}
	
	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody @Valid CandidateLinks candidateLinks){
        return ResponseEntity.ok(this.candidateLinksService.add(candidateLinks));
    }


    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.candidateLinksService.getAll());
    }
}
