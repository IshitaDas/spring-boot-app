package com.fiserv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fiserv.entity.EmpLeaves;
import com.fiserv.entity.Employee;

public interface EmployeeLeavesRepos extends CrudRepository <EmpLeaves, String>{
	
	@Query("select el from EmpLeaves el where el.emp = ?1 and el.startDt between ?2 and ?3")
	public EmpLeaves findByEmp(Employee emp);
	//public List<EmpLeaves> findByEmp(Employee emp);
	
}
