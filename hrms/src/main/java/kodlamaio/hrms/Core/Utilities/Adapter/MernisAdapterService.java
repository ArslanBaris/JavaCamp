package kodlamaio.hrms.Core.Utilities.Adapter;

import java.util.Date;

import kodlamaio.hrms.Business.Abstract.MernisCheckService;
import kodlamaio.hrms.Core.Utilities.Results.ErrorResult;
import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Core.Utilities.Results.SuccessResult;
import kodlamaio.hrms.Entities.Concretes.Candidates;

public class MernisAdapterService implements MernisCheckService {

	@Override
	public Result checkRealPerson(Candidates candidates) {
		 KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		 boolean adapterResult=false;
	 try {
		
			
			 adapterResult=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(
					 candidates.getNationalIdentity()) , candidates.getFirstName().toUpperCase(),
					 candidates.getLastName().toUpperCase(), candidates.getDateOfBirth().getYear());
			 
			System.out.println("Doğrulama: "+(adapterResult ? "Başarılı":"Başarısız"));
	 	}
	
	 catch (Exception e) {
		
		 return new ErrorResult("Doğrulama başarısız");
		 
	}
	 	
	 
		return new SuccessResult("Doğrulama başarılı");
	}

	@Override
	public Result checkVirtualPerson(String nationalityId, String firstName, String lastName, Date birthday) {
		
	
		
		if (nationalityId.isEmpty() || firstName.isEmpty() || lastName.isEmpty() ||  birthday.toString().isEmpty()) {
			
			return new ErrorResult("Doğrulama başarısız");
		}
		return new SuccessResult("Doğrulama başarılı.");
	}

}
