package com.fiserv.repository;

import org.springframework.data.repository.CrudRepository;
import com.fiserv.entity.Employee;

public interface EmployeeRepos extends CrudRepository <Employee, String>{
	
	
}
