package com.fiserv.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "emp_leaves")
public class EmpLeaves {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "leave_id")
	private String leaveId;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee emp;
	
	@ManyToOne
	@JoinColumn(name = "ltype_id")
	private LeaveType leaveType;
	
	@Column(name = "start_dt")
	private Date startDt;
	
	@Column(name = "end_dt")
	private Date endDt;
	
	@Column(name = "leave_count")
	private int leaveCount;
	
	@ManyToOne
	@JoinColumn(name = "status_id")
	private LeaveStatus leaveStatus;

	public String getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(String leaveId) {
		this.leaveId = leaveId;
	}

	public Employee getEmpId() {
		return emp;
	}

	public void setEmpId(Employee emp) {
		this.emp = emp;
	}
	
	public LeaveType getLeaveTypeId() {
		return leaveType;
	}

	public void setLeaveTypeId(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public Date getStartDt() {
		return startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public Date getEndDt() {
		return endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public int getLeaveCount() {
		return leaveCount;
	}

	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
	}

	
	public LeaveStatus getLeaveStatusID() {
		return leaveStatus;
	}

	public void setLeaveStatusId(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

}
