package com.fiserv.repository;

import org.springframework.data.repository.CrudRepository;

import com.fiserv.entity.LeaveStatus;

public interface LeaveStatusRepos extends CrudRepository <LeaveStatus, String>{

}
