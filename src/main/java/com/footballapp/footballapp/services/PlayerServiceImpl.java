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
//		list = new ArrayList<>();
//		list.add(new Player(7, "Bukayo Saka", 255, 80, 200));
//		list.add(new Player(10, "Emile Smith Rowe", 541, 195, 150));
//		list.add(new Player(14, "Pierre Aubameyang", 128, 68, 350));
//		list.add(new Player(35, "Gabriel Martinelli", 110, 43, 120));
//		list.add(new Player(4, "Ben White", 210, 7, 180));
//		list.add(new Player(32, "Aaron Ramsdale", 250, 0, 130)); 
	}

	@Override
	public List<PlayerDTO> getAllPlayers() {
		List <Player> players = playerDao.findAll();
		List<PlayerDTO> playerDTOs = new ArrayList<>();
		for (Player player : players) {
			playerDTOs.add(convertToDto(player));
		}
		System.out.println("Inside Player Service Implementation" + playerDTOs.get(0));
		return playerDTOs;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Player getPlayer(long jerseyNo) {
		// TODO Auto-generated method stub
//		Player p = null;
//		for (Player player : list) {
//			{
//				if(player.getJerseyNo()==jerseyNo) {
//				 p = player;
//				}
//			}
//		}
//		if (p==null) {
//			p.setAppearances(0);
//			p.setFullName(null);
//			p.setGoals(0);
//			p.setJerseyNo(0);
//			p.setWageInPounds(0);
//			return p;
//		}
//		return p;
		return playerDao.findById((int) jerseyNo).get();
//	return playerDao.getOne((int) jerseyNo); --Deprecated so avoid
	}

	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
//		list.add(player);
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