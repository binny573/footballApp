package com.footballapp.footballapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	
	@Id
	private int ID;
	private String position;
	private String name;
	private Date contractExpiry;
	private long salary;
	private String education;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getContractExpiry() {
		return contractExpiry;
	}
	public void setContractExpiry(Date contractExpiry) {
		this.contractExpiry = contractExpiry;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
