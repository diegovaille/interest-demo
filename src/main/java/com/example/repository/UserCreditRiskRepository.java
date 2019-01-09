package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.entity.UserCreditRisk;

@Repository
public interface UserCreditRiskRepository  extends JpaRepository<UserCreditRisk, Integer> {

}
