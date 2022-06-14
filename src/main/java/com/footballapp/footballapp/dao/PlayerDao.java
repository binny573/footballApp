package com.footballapp.footballapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.footballapp.footballapp.entity.Player;

public interface PlayerDao extends JpaRepository<Player, Integer>{

}
