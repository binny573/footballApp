package com.footballapp.footballapp.services;

import java.util.List;

import com.footballapp.footballapp.dao.StaffDao;
import com.footballapp.footballapp.entity.Staff;

public interface StaffService {

	public List<Staff> getStaff();

	public Staff getStaffById(int id);

}
