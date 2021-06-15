package kodlamaio.hrms.Api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.Abstract.SkillsService;
import kodlamaio.hrms.Entities.Concretes.Skills;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

	private SkillsService skillsService;

	@Autowired
	public SkillsController(SkillsService skillsService) {
		super();
		this.skillsService = skillsService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Skills skills){
	        return ResponseEntity.ok(this.skillsService.add(skills));
	}

	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
	    return ResponseEntity.ok(this.skillsService.getAll());
	}
	
}
