package com.interest.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.interest.demo.model.dto.UserCreditRiskDto;
import com.interest.demo.service.UserService;
import com.interest.demo.utils.Constants;

@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value= Constants.CREDIT_RISK, method= RequestMethod.POST)
	@ResponseStatus(org.springframework.http.HttpStatus.CREATED)
	public void saveUserCreditRisk(@RequestBody @Valid UserCreditRiskDto userDto) {
		userService.saveUserCreditRisk(userDto);
	}
	
	@RequestMapping
	public List<UserCreditRiskDto> getUsers() {
		return userService.getUsers();
	}
}
