package com.master.spring.spring6proj1.database.springdata;

import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.master.spring.spring6proj1.database.entities.Person;

public class PersonSpringDataExplicitCustomRepositoryImpl extends SimpleJpaRepository<Person, Integer> implements PersonSpringDataExplicitCustomRepository {

	private EntityManager entityManager;

	public PersonSpringDataExplicitCustomRepositoryImpl(JpaEntityInformation<Person, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.entityManager = entityManager;
	}

	@Override
	public Person findByName(String name) {
		return entityManager.find(Person.class, 100001);
	}

	@Override
	public Person findByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findByBirthDate(Date birthDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findByNameAndLocation(String name, String location) {
		// TODO Auto-generated method stub
		return null;
	}

}
