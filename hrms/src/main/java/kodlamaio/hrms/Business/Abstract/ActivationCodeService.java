package kodlamaio.hrms.Business.Abstract;

import kodlamaio.hrms.Core.Utilities.Results.Result;
import kodlamaio.hrms.Entities.Concretes.ActivationCode;
import kodlamaio.hrms.Entities.Concretes.Users;

public interface ActivationCodeService {
    ActivationCode getByCode(String code);
    String createActivationCode(Users user);
    Result activateUser(String code);
}