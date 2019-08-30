package com.master.spring.spring6proj1.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.master.spring.spring6proj1.database.jpa.PersonJpaRepository;

@EntityScan(basePackages = "com.master.spring.spring6proj1.database.entities")
@SpringBootApplication(scanBasePackages = "com.master.spring.spring6proj1")
public class SpringJpa6proj1Application implements CommandLineRunner {

	@Autowired
	PersonJpaRepository personRepository;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringJpa6proj1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<Person> persons = personRepository.findAll();
//		for (Person person : persons) {
//			logger.info("personRepository.findAll() -> {}", person);
//		}
//
		logger.info("personRepository.findById(100001) -> {}", personRepository.findById(100001));
//		logger.info("personRepository.findByName(Lotfi) -> {}", personRepository.findByName("Lotfi"));
//		logger.info("personRepository.findByLocation(UK) -> {}", personRepository.findByLocation("UK"));
//		logger.info("personRepository.deleteById(100002), rows deleted: {}", personRepository.deleteById(100002));
//
//		persons = personRepository.findAll();
//		for (Person person : persons) {
//			logger.info("personRepository.findAll() -> {}", person);
//		}
//
//		Person nour = new Person(100006, "Nour", "UAE", new GregorianCalendar(2005, Calendar.JUNE, 17).getTime());
//		logger.info("personRepository.insert(), rows affected: {}", personRepository.insert(nour));
//
//		Person abdo = personRepository.findById(100001);
//		abdo.setLocation("UAE");
//		logger.info("personRepository.update(), rows affected: {}", personRepository.update(abdo));
//
//		persons = personRepository.findAll();
//		for (Person person : persons) {
//			logger.info("personRepository.findAll() -> {}", person);
//		}

	}

}
