package com.spring.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sports.model.Cricket;

public interface CricketRepo extends JpaRepository<Cricket, Integer> {

}
