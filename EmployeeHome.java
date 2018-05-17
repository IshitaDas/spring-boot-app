package com.fiserv.view;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.fiserv.entity.EmpLeaves;
import com.fiserv.entity.Employee;
import com.fiserv.entity.LeaveStatus;
import com.fiserv.entity.LeaveType;
import com.fiserv.repository.EmployeeRepos;

public class EmployeeHome {
	
	/* Employee Details */
	String empId;
	String empName;
	String lastLoggedDtTm;
	
	/* Leave Notification */
	String StatusCode;
	
	/* Employee Leave Details */
	int currId;
	String currLeaveSt;
	String currLeaveEnd;
	int prevId;
	String prevLeaveSt;
	String prevLeaveEnd;
	int nextId;
	String nextLeaveSt;
	String nextLeaveEnd;
	int dayCount;
	
	@Autowired
	EmployeeRepos empRepos;
	
	public EmployeeHome (Employee emp, LeaveStatus leaveStatus, EmpLeaves empLeaves){
		String empId, empLastLogDateTime;
		Date startDt, endDt;
		
		empId = emp.getEmpId();
		
		//emp = empRepos.findById(empId).get();
		
		System.out.println("Employee is null ? " + (emp == null));
		
		if (emp != null){
			
		  empName = emp.getEmpName();
		  lastLoggedDtTm = emp.getLastLoginDt().toString().replace("T", " ");
		  
		  if (empLeaves != null){
			  startDt = empLeaves.getStartDt();
			  endDt = empLeaves.getEndDt();
			  
			  Calendar currentDt = Calendar.getInstance();
			  Calendar cal = Calendar.getInstance();
			  cal.setTime(startDt);
			  
			  if (cal.get(Calendar.MONTH) == currentDt.get(Calendar.MONTH)){
				  	      
			      SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");  
			      
			      currLeaveSt = formatter.format(startDt);  
			      currLeaveEnd = formatter.format(endDt);
	  
			  }
		  
		  }

		  
		  
		  /*
		  this.setEmpName(emp.getEmpName());
		  empLastLogDateTime = emp.getLastLoginDt().toString().replace("T", " ");
		  
		  this.setlastLoggedDtTm(empLastLogDateTime);
		  
		  if (leaveStatus != null){
			  this.setLeaveStatus(leaveStatus.getStatueCode());
		  }
		  		   
		  if (empLeaves != null){
			  
			  this.setCurrLeaveSt(empLeaves.getStartDt().toString());
			  this.setCurrLeaveEnd(empLeaves.getEndDt().toString());
		  }*/
			
		 
		}
	}
		
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		  this.empName = empName;	
	}
	public String getlastLoggedDtTm() {
		return lastLoggedDtTm;
	}
	public void setlastLoggedDtTm(String lastLoggedDtTm) {
		this.lastLoggedDtTm = lastLoggedDtTm;
	}
	public String getLeaveStatus() {
		return StatusCode;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.StatusCode = leaveStatus;
	}
	public String getCurrLeaveSt() {
		return currLeaveSt;
	}
	public void setCurrLeaveSt(String currLeaveSt) {
		this.currLeaveSt = currLeaveSt;
	}
	public String getCurrLeaveEnd() {
		return currLeaveEnd;
	}
	public void setCurrLeaveEnd(String currLeaveEnd) {
		this.currLeaveEnd = currLeaveEnd;
	}
	public String getPrevLeaveSt() {
		return prevLeaveSt;
	}
	public void setPrevLeaveSt(String prevLeaveSt) {
		this.prevLeaveSt = prevLeaveSt;
	}
	public String getPrevLeaveEnd() {
		return prevLeaveEnd;
	}
	public void setPrevLeaveEnd(String prevLeaveEnd) {
		this.prevLeaveEnd = prevLeaveEnd;
	}
	public String getNextLeaveSt() {
		return nextLeaveSt;
	}
	public void setNextLeaveSt(String nextLeaveSt) {
		this.nextLeaveSt = nextLeaveSt;
	}
	public String getNextLeaveEnd() {
		return nextLeaveEnd;
	}
	public void setNextLeaveEnd(String nextLeaveEnd) {
		this.nextLeaveEnd = nextLeaveEnd;
	}
	public int getDayCount() {
		return dayCount;
	}
	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}
}
