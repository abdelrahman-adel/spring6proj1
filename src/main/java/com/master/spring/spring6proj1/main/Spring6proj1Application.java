package com.master.spring.spring6proj1.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

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
		logger.info("personJdbcDao.findAll() -> {}",personJdbcDao.findAll());
	}

}
