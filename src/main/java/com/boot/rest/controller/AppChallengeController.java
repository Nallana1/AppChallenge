package com.boot.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.rest.pojo.Routes;
import com.boot.rest.repo.CityRoutes;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")

public class AppChallengeController {
	
	@Autowired
	CityRoutes cityroutesrepo;
	
	@GetMapping("/accounts")
	public List<Routes> getAll(){
		return cityroutesrepo.findAll();
	}
	
	@GetMapping("/accounts/{account_id}")
	public Optional<Routes> getById(@PathVariable(value="account_id") Long account_id){
		return cityroutesrepo.findById(account_id);
	
	}
	
}
