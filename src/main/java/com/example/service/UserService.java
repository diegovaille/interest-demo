package com.example.service;

import java.util.List;

import com.example.model.dto.UserCreditRiskDto;

public interface UserService {

	void saveUserCreditRisk(UserCreditRiskDto userDto);

	List<UserCreditRiskDto> getUsers();
}
