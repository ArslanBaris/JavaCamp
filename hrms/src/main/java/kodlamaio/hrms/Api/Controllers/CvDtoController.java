package kodlamaio.hrms.Api.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.Abstract.CvDtoService;
import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.Candidates;
import kodlamaio.hrms.Entities.Dtos.CvDto;

@RestController
@RequestMapping("/api/cvDto")
public class CvDtoController {

	private CvDtoService cvDtoService;

	@Autowired
	public CvDtoController(CvDtoService cvDtoService) {
		super();
		this.cvDtoService = cvDtoService;
	}
	
	@GetMapping("/getCVByCandidate")
	public DataResult<CvDto> getCVByCandidate(@RequestParam int candidateId){
		return this.cvDtoService.getCVByCandidate(candidateId);
	}
	
	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody @Valid CvDto cvDto, int candidateId) {
        return ResponseEntity.ok(cvDtoService.add(cvDto,candidateId));
    }
	
	
	
}
