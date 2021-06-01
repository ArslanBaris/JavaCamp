package kodlamaio.hrms.Core.Utilities.Bussiness;

import kodlamaio.hrms.Core.Utilities.Results.Result;

public class BusinessRules {

	public static Result run(Result... logics) {
		for (Result logic : logics)
		{
			if (!logic.isSuccess())
			{
				return logic;
			}
		}		
		return null;
	}
}
