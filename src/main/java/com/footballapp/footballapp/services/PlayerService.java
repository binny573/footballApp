package com.footballapp.footballapp.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.footballapp.footballapp.entity.Player;

public interface PlayerService {
	
	public List<Player> getPlayers();
	
	public Player getPlayer(long jerseyNo);
	
	public Player addPlayer(Player player);
	
	public Player updatePlayer(Player player);
	
	public void deletePlayerProfile(long parseLong);
}
