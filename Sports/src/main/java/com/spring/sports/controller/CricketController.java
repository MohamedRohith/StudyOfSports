package com.spring.sports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.sports.model.Cricket;
import com.spring.sports.repository.CricketRepo;

@RestController
public class CricketController {
	@Autowired
	private CricketRepo crirepository;
	@PostMapping("/Save")
	public String saveCricket(@RequestBody Cricket criData) {
		crirepository.save(criData);
		return "Data saved";
	}
	@GetMapping("/getData")
	public List<Cricket> getCricket() {
		return this.crirepository.findAll();
	}

}
