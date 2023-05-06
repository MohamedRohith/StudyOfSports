package com.spring.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sports.model.Additionalmodel;

public interface AdditionalRepo extends JpaRepository<Additionalmodel, Integer> {

}
