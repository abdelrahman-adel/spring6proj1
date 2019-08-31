package com.master.spring.spring6proj1.database.springdata;

import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.master.spring.spring6proj1.database.entities.Person;

@Primary
public class PersonSpringDataExplicitCustomeRepositoryImpl extends SimpleJpaRepository<Person, Integer>
		implements PersonSpringDataExplicitCustomeRepository {

	private EntityManager entityManager;

	public PersonSpringDataExplicitCustomeRepositoryImpl(JpaEntityInformation<Person, ?> entityInformation,
			EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.entityManager = entityManager;
	}

	public PersonSpringDataExplicitCustomeRepositoryImpl(Class<Person> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		this.entityManager = entityManager;
	}

	@Override
	public Person findByName(String name) {
		// TODO Auto-generated method stub
		return null;
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
