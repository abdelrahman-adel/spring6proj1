package com.master.spring.spring6proj1.database.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.master.spring.spring6proj1.database.entities.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	public Object findByName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object findByLocation(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object deleteById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object insert(Person nour) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object update(Person abdo) {
		// TODO Auto-generated method stub
		return null;
	}
}
