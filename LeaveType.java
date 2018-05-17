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
@Table(name = "leaves_type")
public class LeaveType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ltype_id")
	private String ltypeId;
	
	@Column(name = "leave_type")
	private String leaveType;
	
	@Column(name = "max_leave")
	private int leaveMaxCount;
	
	@OneToMany(mappedBy="leaveType")
	List<EmpLeaves> empLeaves;

	public String getLtypeId() {
		return ltypeId;
	}

	public void setLtypeId(String ltypeId) {
		this.ltypeId = ltypeId;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public int getLeaveMaxCount() {
		return leaveMaxCount;
	}

	public void setLeaveMaxCount(int leaveMaxCount) {
		this.leaveMaxCount = leaveMaxCount;
	}

	public List<EmpLeaves> getEmpLeaves() {
		return empLeaves;
	}

	public void setEmpLeaves(List<EmpLeaves> empLeaves) {
		this.empLeaves = empLeaves;
	}
	
	
    
}
