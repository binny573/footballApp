package com.footballapp.footballapp.dto;

import lombok.Data;

@Data
public class PlayerDTO {
	private Integer jerseyno;
	private String fullname;
	private Integer appearances;
	private Integer goals;

    public PlayerDTO(Integer jerseyNo, String fullname, Integer appearances, Integer goals) {
        this.jerseyno = jerseyNo;
        this.fullname = fullname;
        this.appearances = appearances;
        this.goals = goals;
    }
}