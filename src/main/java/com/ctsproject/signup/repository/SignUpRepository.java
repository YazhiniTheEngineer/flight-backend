package com.ctsproject.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctsproject.signup.model.Passenger;

@Repository
public interface SignUpRepository extends JpaRepository<Passenger,Long>{
	
}
