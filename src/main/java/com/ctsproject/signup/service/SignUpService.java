package com.ctsproject.signup.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.ctsproject.signup.model.Login;
import com.ctsproject.signup.model.Passenger;
import com.ctsproject.signup.repository.SignUpRepository;

@Service
public class SignUpService {
	
	@Autowired
	private SignUpRepository signUpRepo;
	
	public void saveInfo(Passenger passenger) {
		signUpRepo.save(passenger);
	}
	
	public List<Passenger> getAllPassengers(){
		List<Passenger> passenger = new ArrayList<>();
		signUpRepo.findAll().forEach(passenger::add);
		return passenger;
	}

	public boolean getPassenger(String emailId, String password) {
		List<Passenger> l = getAllPassengers();
		for(Passenger p : l) {
			if(p.getEmailId().equals(emailId) 
					&& p.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public boolean isAvailableInSignUp(Login login) {
		List<Passenger> l = getAllPassengers();
		String emailId = login.getEmailId();
		String password = login.getPassword();
		for(Passenger p : l) {
			if(p.getEmailId().equals(emailId) 
					&& p.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
}
