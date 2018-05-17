package com.fiserv.service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiserv.entity.EmpLeaves;
import com.fiserv.entity.Employee;
import com.fiserv.entity.LeaveStatus;
import com.fiserv.entity.LeaveType;
import com.fiserv.repository.EmployeeLeavesRepos;
import com.fiserv.repository.EmployeeRepos;
import com.fiserv.repository.LeaveStatusRepos;
import com.fiserv.repository.LeaveTypeRepos;
import com.fiserv.view.EmployeeHome;

@Service
public class LoginService {
	
	@Autowired
	EmployeeRepos empRepos;
	
	@Autowired
	LeaveTypeRepos leaveTypeRepos;
	
	@Autowired
	LeaveStatusRepos leaveStatusRepos;
	
	@Autowired
	EmployeeLeavesRepos empLeaveRepos;
	
	Employee emp;
	LeaveType leaveType;
	LeaveStatus leaveStatus;
	EmpLeaves empLeaves;
	

	
	public boolean authUser(String uname, String pwd){
		
		emp = empRepos.findById(uname).get();
		pwd = pwd.trim();
		
		if ((emp == null) || (!emp.getEmpPwd().equals(pwd))){ 
			return false;
		}	
		return true;		
	}
	
	
	
    /*public String authUser(String uname, String pwd){
    	
    	boolean validEmployee;
    	String empName, empLastLogDateTime;
    	
    	 Check using employee id, if employee is valid 
    	validEmployee = empRepos.findById(uname).isPresent(); 
    	
    	System.out.println("Valid Employee = " + validEmployee);
    	
    	if (validEmployee)
    		emp = empRepos.findById(uname).get();
		  
		 Login error 
		if (emp == null)
			return "Error:Incorrect Login ID";	
		else if (!emp.getEmpPwd().equals(pwd))
			return "Error:Incorrect Pwd";	
		
		 Successful Login  
		empName = emp.getEmpName();
		
		if (emp.getLastLoginDt() != null)
			empLastLogDateTime = emp.getLastLoginDt().toString().replace("T", " ");
		else
			empLastLogDateTime = LocalDateTime.now().toString();
		
		emp.setLastLoginDt(LocalDateTime.now());
		empRepos.save(emp);
				
		return "Success:" + empName + ", Last Logged at: " + empLastLogDateTime;
    }*/
	
    
    public EmployeeHome getHomePageDetail(String employeeId){
    		
    	String eId, statusCode, leaveTypeCode;
    	
    	emp = empRepos.findById(employeeId).get();
    		
    	if (emp != null){
    		    		
    		empLeaves = empLeaveRepos.findByEmp(emp);
    		
    		leaveStatus = empLeaves.getLeaveStatusID();
    		//leaveType = empLeaves.getLeaveTypeId();
    			    		
    		EmployeeHome empHomeDetail = new EmployeeHome(emp, leaveStatus, empLeaves);	
    		
    		/*if (leaveType != null)
    			leaveTypeCode = leaveType.getLeaveType();
    		
    		empHomeDetail.setLeaveStatus(statusCode);*/
    		
    		emp.setLastLoginDt(LocalDateTime.now());
   		    empRepos.save(emp);
    			
    		return empHomeDetail; 
    	}
      
    	return null;
    }
}
