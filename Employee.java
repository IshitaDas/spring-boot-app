package com.fiserv.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emp_details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private String empId;
	
	@ManyToOne
	@JoinColumn(name = "grp_id")
	private Group group;
	
	@Column(name = "emp_pwd")
	private String empPwd;
	
	@Column(name = "emp_fname")
	private String empFname;
	
	@Column(name = "emp_lname")
	private String empLname;
	
	@Column(name = "emp_name")
	private String empName;

	@Column(name = "mobile")
	private Integer mobile;
	
	@Column(name = "extension")
	private Integer extension;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "mgr_name")
	private String mgrName;
	
	@Column(name = "joining_dt")
	private Integer joiningDate;
	
	@Column(name = "last_login_dt")
	private LocalDateTime lastLoginDt;
	
	@OneToMany(mappedBy="emp")
	List<EmpLeaves> empLeavesList;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	public String getEmpFname() {
		return empFname;
	}

	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}

	public String getEmpLname() {
		return empLname;
	}

	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Group getGroupId() {
		return group;
	}

	public void setGroupId(Group group) {
		this.group = group;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public Integer getExtension() {
		return extension;
	}

	public void setExtension(Integer extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMgrName() {
		return mgrName;
	}

	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}

	public int getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(int joiningDate) {
		this.joiningDate = joiningDate;
	}

	public LocalDateTime getLastLoginDt() {
		return lastLoginDt;
	}

	public void setLastLoginDt(LocalDateTime lastLoginDt) {
		this.lastLoginDt = lastLoginDt;
	}
	
	

	/*
	 * private Integer emp_id; private String emp_pwd; private String emp_fname;
	 * private String emp_lname; private String emp_name; private Integer
	 * grp_id; private Integer mobile; private Integer extension; private String
	 * email; private String mgr_name; private Date joining_dt = new Date();
	 */

}