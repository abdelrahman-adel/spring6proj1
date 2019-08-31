package com.master.spring.spring6proj1.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.master.spring.spring6proj1.database.entities.Person;
import com.master.spring.spring6proj1.database.springdata.PersonSpringDataExplicitCustomRepository;
import com.master.spring.spring6proj1.database.springdata.PersonSpringDataExplicitCustomRepositoryImpl;

/**
 * We need <code>@EntityScan</code> to give it the package where it should scan
 * for entites.
 * 
 * We need <code>@EnableJpaRepositories</code> to give it the package where it
 * should scan for predefined entities.
 * 
 * @author Abd-Elrahman Adel
 *
 */
@EntityScan(basePackages = "com.master.spring.spring6proj1.database.entities")
@EnableJpaRepositories(basePackages = "com.master.spring.spring6proj1.database.springdata", repositoryBaseClass = PersonSpringDataExplicitCustomRepositoryImpl.class)
@SpringBootApplication(scanBasePackages = "com.master.spring.spring6proj1")
public class SpringDataExplicitCustomRepoApp implements CommandLineRunner {

	@Autowired
	PersonSpringDataExplicitCustomRepository personSpringDataExplicitCustomRepository;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringDataExplicitCustomRepoApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> persons = personSpringDataExplicitCustomRepository.findAll();
		for (Person person : persons) {
			logger.info("personSpringDataExplicitCustomRepository.findAll() -> {}", person);
		}

		logger.info("personSpringDataExplicitCustomRepository.findById(100001) -> {}", personSpringDataExplicitCustomRepository.findById(100001));
		logger.info("personSpringDataExplicitCustomRepository.findByName(Lotfi) -> {}", personSpringDataExplicitCustomRepository.findByName("Lotfi"));
		logger.info("personSpringDataExplicitCustomRepository.findByLocation(UK) -> {}", personSpringDataExplicitCustomRepository.findByLocation("UK"));
		personSpringDataExplicitCustomRepository.deleteById(100002);
		logger.info("personSpringDataExplicitCustomRepository.deleteById(100002), deleted 100002");

		persons = personSpringDataExplicitCustomRepository.findAll();
		for (Person person : persons) {
			logger.info("personSpringDataExplicitCustomRepository.findAll() -> {}", person);
		}

		Person nour = new Person("Nour", "UAE", new GregorianCalendar(2005, Calendar.JUNE, 17).getTime());
		logger.info("personSpringDataExplicitCustomRepository.insert(), row inserted: {}", personSpringDataExplicitCustomRepository.save(nour));

		Optional<Person> abdo = personSpringDataExplicitCustomRepository.findById(100001);
		abdo.get().setLocation("UAE");
		logger.info("personSpringDataExplicitCustomRepository.update(), row updated: {}", personSpringDataExplicitCustomRepository.save(abdo.get()));

		persons = personSpringDataExplicitCustomRepository.findAll();
		for (Person person : persons) {
			logger.info("personSpringDataExplicitCustomRepository.findAll() -> {}", person);
		}

		logger.info("personSpringDataExplicitCustomRepository.findByBirthDate(2005-06-17 00:00:00.0) -> {}",
				personSpringDataExplicitCustomRepository.findByBirthDate(new GregorianCalendar(2005, Calendar.JUNE, 17).getTime()));

		logger.info("personSpringDataExplicitCustomRepository.findByNameAndLocation(Mohamed Sameh, Sudan) -> {}",
				personSpringDataExplicitCustomRepository.findByNameAndLocation("Mohamed Sameh", "Sudan"));

	}

}
