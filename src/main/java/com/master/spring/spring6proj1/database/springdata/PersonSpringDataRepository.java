package com.master.spring.spring6proj1.database.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.spring.spring6proj1.database.entities.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
