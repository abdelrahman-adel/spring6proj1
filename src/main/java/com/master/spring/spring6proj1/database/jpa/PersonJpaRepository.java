package com.master.spring.spring6proj1.database.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.master.spring.spring6proj1.database.entities.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Person> findAll() {
		TypedQuery<Person> findAll = entityManager.createNamedQuery("findAll", Person.class);
		return findAll.getResultList();
	}

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	public List<Person> findByName(String name) {
		TypedQuery<Person> findByName = entityManager.createNamedQuery("findByName", Person.class);
		findByName.setParameter("name", name);
		return findByName.getResultList();
	}

	public List<Person> findByLocation(String string) {
		TypedQuery<Person> findByLocation = entityManager.createNamedQuery("findByLocation", Person.class);
		return findByLocation.getResultList();
	}

	public void deleteById(int id) {
		Person person = findById(id);
		if (null != person) {
			entityManager.remove(person);
		}
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	public Person update(Person person) {
		return entityManager.merge(person);
	}
}
