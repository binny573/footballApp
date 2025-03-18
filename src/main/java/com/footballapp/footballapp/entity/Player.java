package com.footballapp.footballapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Player")
public class Player {

	@Id
	private Integer id;
	private Integer jerseyno;
	private String fullname;
	private Integer appearances;
	private Integer goals;
	private Integer teamid;
	// private long wageinpounds;

//	@ConstructorProperties(value = { "jerseyNo", "fullname", "appearances", "goals", "wageinpounds" })
//	public Player(Integer jerseyNo, String fullname, int appearances, int goals, long wageinpounds) {
//		super();
//		this.jerseyNo = jerseyNo;
//		this.fullname = fullname;
//		this.appearances = appearances;
//		this.goals = goals;
//		this.wageinpounds = wageinpounds;
//	} This created the problem , now it works haha aha 

	//Alt+shift+S, r,....space down, space down

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTeamId() {
		return teamid;
	}
	public void setTeamId(Integer teamid) {
		this.teamid = teamid;
	}

	public String getFullName() {
		return fullname;
	}
	public void setFullName(String fullname) {
		this.fullname = fullname;
	}
	public Integer getAppearances() {
		return appearances;
	}
	public void setAppearances(Integer appearances) {
		this.appearances = appearances;
	}
	public Integer getGoals() {
		return goals;
	}
	public void setGoals(Integer goals) {
		this.goals = goals;
	}
	// public long getWageInPounds() {
	// 	return wageinpounds;
	// }
	// public void setWageInPounds(long wageinpounds) {
	// 	this.wageinpounds = wageinpounds;
	// }
	public Integer getJerseyNo() {
		return jerseyno;
	}
	public void setJerseyNo(Integer jerseyno) {
		this.jerseyno = jerseyno;
	}
}
