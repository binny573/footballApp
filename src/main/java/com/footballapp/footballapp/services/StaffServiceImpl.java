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
		System.out.println("Inside Staff Service Implementation " + this.staffDao.findAll().size());
		List<Staff> staff = this.staffDao.findAll();
		return staff;
	}
	@Override
	public Staff getStaffById(int id)
	{
		Staff staff = new Staff();
		try{
			staff = staffDao.findById(id);
			return staff;
		}
		catch(Exception e)
		{
			System.out.println("Exception in getStaffById " + e );
			return staff;
		}
	}
}