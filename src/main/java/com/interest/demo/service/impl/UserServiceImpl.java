package com.interest.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interest.demo.model.converter.UserCreditRiskConverter;
import com.interest.demo.model.dto.UserCreditRiskDto;
import com.interest.demo.repository.UserCreditRiskRepository;
import com.interest.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserCreditRiskRepository userCreditRiskRepository;
	
	@Override
	public void saveUserCreditRisk(UserCreditRiskDto userDto) {
		// TODO Auto-generated method stub
		userCreditRiskRepository.save(UserCreditRiskConverter.dtoToEntity(userDto));
	}

	@Override
	public List<UserCreditRiskDto> getUsers() {
		// TODO Auto-generated method stub
		return userCreditRiskRepository.findAll().stream().map(UserCreditRiskConverter::entityToDto).collect(Collectors.toList());
	}

}
