package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.dto.UserCreditRiskDto;
import com.example.service.UserService;
import com.example.utils.Constants;

@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value= Constants.CREDIT_RISK, method= RequestMethod.POST)
	public void saveUserCreditRisk(@RequestBody UserCreditRiskDto userDto) {
		userService.saveUserCreditRisk(userDto);
	}
	
	@RequestMapping
	public List<UserCreditRiskDto> getUsers() {
		return userService.getUsers();
	}
}
