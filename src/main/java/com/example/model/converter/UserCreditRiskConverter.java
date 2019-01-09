package com.example.model.converter;

import com.example.model.dto.UserCreditRiskDto;
import com.example.model.entity.UserCreditRisk;

public class UserCreditRiskConverter {

	public static UserCreditRisk dtoToEntity(UserCreditRiskDto userDto) {

		return new UserCreditRisk(userDto.getClientName(), userDto.getRiskType(), userDto.getCreditLimit());
	}

	public static UserCreditRiskDto entityToDto(UserCreditRisk user) {
		UserCreditRiskDto userDto = new UserCreditRiskDto();

		userDto.setClientName(user.getClientName());
		userDto.setRiskType(user.getRiskType());
		userDto.setInterestRate(user.getInterestRate());
		userDto.setCreditLimit(user.getCreditLimit());
		return userDto;
	}
}
