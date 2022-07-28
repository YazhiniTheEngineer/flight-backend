package com.ctsproject.signup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctsproject.signup.model.Passenger;
import com.ctsproject.signup.service.SignUpService;

@RestController
public class SignUpController {
	
	@Autowired
	private SignUpService signUpservice;

	@PostMapping("/signup")
	public void saveInfo(@RequestBody Passenger passenger){
		signUpservice.saveInfo(passenger);
	}
	
	@GetMapping("/signup")
	public List<Passenger> getAllPassengers(){
		return signUpservice.getAllPassengers();
	}
	
	@GetMapping("/login")
	public boolean getPassenger(@RequestParam String emailId, @RequestParam String password) {
		return signUpservice.getPassenger(emailId,password);
	}
}
