package com.footballapp.footballapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id
	private Integer jerseyNo;
	private String fullName;
	private int appearances;
	private int goals;
	private long wageInPounds;
		
//	@ConstructorProperties(value = { "jerseyNo", "fullName", "appearances", "goals", "wageInPounds" })
//	public Player(Integer jerseyNo, String fullName, int appearances, int goals, long wageInPounds) {
//		super();
//		this.jerseyNo = jerseyNo;
//		this.fullName = fullName;
//		this.appearances = appearances;
//		this.goals = goals;
//		this.wageInPounds = wageInPounds;
//	} This created the problem , now it works haha aha 
	
	//Alt+shift+S, r,....space down, space down
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAppearances() {
		return appearances;
	}
	public void setAppearances(int appearances) {
		this.appearances = appearances;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public long getWageInPounds() {
		return wageInPounds;
	}
	public void setWageInPounds(long wageInPounds) {
		this.wageInPounds = wageInPounds;
	}
	public Integer getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(Integer jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
}
