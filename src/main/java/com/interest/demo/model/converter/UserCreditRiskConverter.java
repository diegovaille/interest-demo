package com.interest.demo.model.converter;

import com.interest.demo.model.dto.UserCreditRiskDto;
import com.interest.demo.model.entity.UserCreditRisk;

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
