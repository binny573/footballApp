package com.footballapp.footballapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.footballapp.footballapp.dao.StaffDao;
import com.footballapp.footballapp.entity.Player;
import com.footballapp.footballapp.entity.Staff;
import com.footballapp.footballapp.services.PlayerService;
import com.footballapp.footballapp.services.StaffService;


@RestController
public class MyController {
	
	@Autowired
	private PlayerService rosterservice;
	
	@Autowired
	private StaffService staffservice;

	@GetMapping("/home")
	public String test() {
		return "Hell yeah22";
	}
	
	@GetMapping("/roster")
	public List<Player> getRoster() 
	{
		return this.rosterservice.getRoster();
	}
	
	@GetMapping("/staff")
	public List<Staff> getStaff()
	{
		return this.staffservice.getStaff();
	}
	
//	@RequestMapping(path= "/courses", method = RequestMethod.GET) --- Use this with MVC, below is Rest approach, less lengthy.  
	@GetMapping("/roster/{jerseyNo}")
	public Player getPlayer(@PathVariable String jerseyNo)
	{
		try {
			System.out.println("Does the request even come here??");
			return this.rosterservice.getPlayer(Long.parseLong(jerseyNo));			
		}
		catch(Exception e) {
			Player p = new Player();
//			p.setJerseyNo(null);
//			p.setAppearances(0);
//			p.setFullName(jerseyNo);
//			p.setGoals(0);
//			p.setWageInPounds(0);
			return p;
			
		}
	}
	
	@PostMapping("/roster")
	public Player addPlayer(@RequestBody Player player) 
	{
		return this.rosterservice.addPlayer(player);
	}
	
	
	//Same put and post, need to make distinct
	@PutMapping("/roster")
	public Player updatePlayer(@RequestBody Player player)
	{
		return this.rosterservice.updatePlayer(player);
	}
	
	@DeleteMapping("/roster/{jerseyNo}")
	public ResponseEntity<HttpStatus> deletePlayerProfile(@PathVariable String jerseyNo){
		try {
		this.rosterservice.deletePlayerProfile(Long.parseLong(jerseyNo));
		return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
}

