package com.footballapp.footballapp.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.footballapp.footballapp.entity.Player;
import com.footballapp.footballapp.dto.PlayerDTO;

public interface PlayerService {
	
	public List<PlayerDTO> getAllPlayers();
	
	public Player getPlayer(long jerseyNo);
	
	public Player addPlayer(Player player);
	
	public Player updatePlayer(Player player);
	
	public void deletePlayerProfile(long parseLong);
}
