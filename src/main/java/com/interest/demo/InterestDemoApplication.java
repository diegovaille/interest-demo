package com.interest.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.interest.demo.model.Risk;
import com.interest.demo.model.entity.UserCreditRisk;
import com.interest.demo.repository.UserCreditRiskRepository;

@SpringBootApplication
public class InterestDemoApplication {

	@Autowired
	UserCreditRiskRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(InterestDemoApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		UserCreditRisk user= new UserCreditRisk("Diego", Risk.B, 10000D);
		userRepository.save(user);
	}
}
