package kodlamaio.hrms.Api.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.Abstract.LinkTypeService;
import kodlamaio.hrms.Entities.Concretes.LinkTypes;

@RestController
@RequestMapping("/api/linkType")
public class LinkTypeController {

	private LinkTypeService linkTypeService;

	public LinkTypeController(LinkTypeService linkTypeService) {
		super();
		this.linkTypeService = linkTypeService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody LinkTypes linkTypes){
	        return ResponseEntity.ok(this.linkTypeService.add(linkTypes));
	}

	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
	    return ResponseEntity.ok(this.linkTypeService.getAll());
	}
}
