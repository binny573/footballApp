package com.footballapp.footballapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {

	public Staff() {
		super();
	}
	@Id
	private int ID;
	private String name;
	// @Column(name = "contractExpiry")
	private Date contractexpiry;
	private long salary;
	private String education;
	// @Column(name = "teamid")
	private int teamid;

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Date getcontractexpiry() {
		return contractexpiry;
	}
	public void setcontractexpiry(Date contractexpiry) {
		this.contractexpiry = contractexpiry;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getTeamId() {
		return teamid;
	}
	public void setTeamId(int teamid) {
		this.teamid = teamid;
	}
}
