package kodlamaio.hrms.Business.Concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.Abstract.MernisCheckService;
import kodlamaio.hrms.Core.Utilities.Adapter.MernisServiceAdapter;

@Service
public class MernisCheckManager {
	 MernisCheckService mernisCheckService;
		
	 @Autowired
    public MernisCheckManager() {

		mernisCheckService = new MernisServiceAdapter();
	}
}
