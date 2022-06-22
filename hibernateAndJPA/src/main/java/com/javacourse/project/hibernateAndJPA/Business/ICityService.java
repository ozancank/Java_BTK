package com.javacourse.project.hibernateAndJPA.Business;

import java.util.List;
import com.javacourse.project.hibernateAndJPA.Entities.City;

public interface ICityService {
	List<City> getAll();

	void add(City city);

	void update(City city);

	void delete(City city);

	City getById(int id);
}
