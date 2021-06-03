package kodlamaio.hrms.Core.Utilities.Adapter;

import java.util.Date;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.MernisCheckService;

@Service
public class MernisServiceAdapter implements MernisCheckService {


	@Override
	public boolean checkVirtualPerson(String nationalityId, String firstName, String lastName, 
			Date birthday) {
	
		
		if (nationalityId.isEmpty() || firstName.isEmpty() || lastName.isEmpty() ||  birthday.toString().isEmpty()) {
			
			return false;
		}
		return true;
	}

 

}
