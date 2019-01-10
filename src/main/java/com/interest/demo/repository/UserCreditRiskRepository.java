package com.interest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interest.demo.model.entity.UserCreditRisk;

@Repository
public interface UserCreditRiskRepository  extends JpaRepository<UserCreditRisk, Integer> {

}
