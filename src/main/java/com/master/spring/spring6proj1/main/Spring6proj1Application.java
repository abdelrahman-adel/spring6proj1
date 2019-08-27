package com.master.spring.spring6proj1.main;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.master.spring.spring6proj1.database.entities.Person;
import com.master.spring.spring6proj1.database.jdbc.PersonJdbcDao;

@ComponentScan(basePackages = "com.master.spring.spring6proj1")
@SpringBootApplication
public class Spring6proj1Application implements CommandLineRunner {

	@Autowired
	PersonJdbcDao personJdbcDao;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(Spring6proj1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> persons = personJdbcDao.findAll();
		for (Person person : persons) {
			logger.info("personJdbcDao.findAll() -> {}", person);
		}
		logger.info("personJdbcDao.findById(100001) -> {}", personJdbcDao.findById(100001));
		logger.info("personJdbcDao.findByName(Lotfi) -> {}", personJdbcDao.findByName("Lotfi"));
		logger.info("personJdbcDao.findByLocation(UK) -> {}", personJdbcDao.findByLocation("UK"));
		logger.info("personJdbcDao.deleteById(100002), rows deleted: {}", personJdbcDao.deleteById(100002));
		persons = personJdbcDao.findAll();
		for (Person person : persons) {
			logger.info("personJdbcDao.findAll() -> {}", person);
		}
	}

}
