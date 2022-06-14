package com.footballapp.footballapp.dao;
	
import org.springframework.data.jpa.repository.JpaRepository;

import com.footballapp.footballapp.entity.Staff;


public interface StaffDao extends JpaRepository<Staff, Integer> {

}
