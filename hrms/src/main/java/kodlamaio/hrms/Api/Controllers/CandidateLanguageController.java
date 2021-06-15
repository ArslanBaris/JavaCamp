package kodlamaio.hrms.Api.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.Abstract.CandidateLanguageService;
import kodlamaio.hrms.Entities.Concretes.CandidateLanguage;

@RestController
@RequestMapping("/api/candidateLanguage")
public class CandidateLanguageController {

	private CandidateLanguageService candidateLanguageService;

	@Autowired
	public CandidateLanguageController(CandidateLanguageService candidateLanguageService) {
		super();
		this.candidateLanguageService = candidateLanguageService;
	}

	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody @Valid CandidateLanguage candidateLanguage){
        return ResponseEntity.ok(this.candidateLanguageService.add(candidateLanguage));
    }


    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.candidateLanguageService.getAll());
    }

}
