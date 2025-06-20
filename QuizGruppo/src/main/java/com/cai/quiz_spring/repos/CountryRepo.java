package com.cai.quiz_spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cai.quiz_spring.entities.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, String> {

}
