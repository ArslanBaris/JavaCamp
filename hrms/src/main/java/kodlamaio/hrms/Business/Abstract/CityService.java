package kodlamaio.hrms.Business.Abstract;

import java.util.List;

import kodlamaio.hrms.Core.Utilities.Results.DataResult;
import kodlamaio.hrms.Entities.Concretes.City;

public interface CityService {

	DataResult<List<City>> getAll();
}
