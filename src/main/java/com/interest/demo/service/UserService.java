package com.interest.demo.service;

import java.util.List;

import com.interest.demo.model.dto.UserCreditRiskDto;

public interface UserService {

	void saveUserCreditRisk(UserCreditRiskDto userDto);

	List<UserCreditRiskDto> getUsers();
}
