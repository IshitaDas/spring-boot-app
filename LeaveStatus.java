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
@Table(name = "leave_status")
public class LeaveStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "status_id")
	private String statusId;
		
	@Column(name = "status")
	private String statueCode;
	
	@OneToMany(mappedBy="leaveStatus")
	List<EmpLeaves> empLeaves;

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getStatueCode() {
		return statueCode;
	}

	public void setStatueCode(String statueCode) {
		this.statueCode = statueCode;
	}

	public List<EmpLeaves> getEmpLeaves() {
		return empLeaves;
	}

	public void setEmpLeaves(List<EmpLeaves> empLeaves) {
		this.empLeaves = empLeaves;
	}

}
