package com.fiserv.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="emp_grp")
public class Group {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "grp_id")
	private String groupId;
	
	@Column(name="grp_name")
	private String groupName;
	
	@OneToMany(mappedBy="group")
	List<Employee> employeeList;
	
	
}
