package com.footballapp.footballapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballapp.footballapp.dao.StaffDao;
import com.footballapp.footballapp.entity.Staff;


@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffDao staffDao;
	
	@Override
	public List<Staff> getStaff() {
		// TODO Auto-generated method stub
		//staffDao.findAll();
		return staffDao.findAll();
	}

}
