package com.fiserv.repository;

import org.springframework.data.repository.CrudRepository;

import com.fiserv.entity.LeaveType;

public interface LeaveTypeRepos extends CrudRepository <LeaveType, String> {

}
