package com.master.spring.spring6proj1.database.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.spring.spring6proj1.database.entities.Person;

/**
 * When you create an interface and inherit the <code>JpaRepository</code>, this
 * becomes interface of the predefined repository.
 * 
 * @author Abd-Elrahman Adel
 *
 */
public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
