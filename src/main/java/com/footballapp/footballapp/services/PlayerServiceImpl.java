package com.footballapp.footballapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.footballapp.footballapp.dao.PlayerDao;
import com.footballapp.footballapp.entity.Player;

import com.footballapp.footballapp.services.*;
import com.footballapp.footballapp.dto.PlayerDTO;

@Service
public class PlayerServiceImpl implements PlayerService {

//	List<Player> list;
	// dependency inject kar de
	@Autowired
	private PlayerDao playerDao;

	public PlayerServiceImpl() {
	}

	@Override
	public List<PlayerDTO> getAllPlayers() {
		List <Player> players = playerDao.findAll();
		return players.stream().map(this::convertToDto).collect(Collectors.toList());
	}

	@SuppressWarnings("deprecation")
	@Override
	public Player getPlayer(long jerseyNo) {
		// TODO Auto-generated method stub
		return playerDao.findById((int) jerseyNo).get();
//	return playerDao.getOne((int) jerseyNo); --Deprecated so avoid
	}

	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
		playerDao.save(player);
		return player;
	}

	@Override
	public Player updatePlayer(Player player) {
		playerDao.save(player);
		return player;

	}

	@Override
	public void deletePlayerProfile(long parseLong) {
		// TODO Auto-generated method stub
//		list = this.list.stream().filter(e->e.getJerseyNo()!= parseLong).collect(Collectors.toList());
		Player entity = playerDao.getOne((int) parseLong); 
//		playerDao.deleteById(parseLong);Failed
		playerDao.delete(entity);
	}

	public PlayerDTO convertToDto(Player player){
		System.out.println("Here are the players in the list " + player.getFullName());
		return new PlayerDTO(
			player.getJerseyNo(),
			player.getFullName(),
			player.getAppearances(),
			player.getGoals()
		);
	}
}