
package com.example.Education_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Education_proj.domain.Car;
import com.example.Education_proj.domain.CarRepository;
import com.example.Education_proj.domain.Owner;
import com.example.Education_proj.domain.OwnerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class EducationProjApplication {
    @Autowired 
    private CarRepository repository;
    @Autowired 
    private OwnerRepository orepository;
	  private static final Logger logger = LoggerFactory.getLogger(EducationProjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EducationProjApplication.class, args);
		 logger.info("Hello Spring Boot");
	}
		 @Bean
	        CommandLineRunner runner(){
	          return args -> {
//	            // Place your code here
//
//	              // Add owner objects and save these to db
	              Owner owner1 = new Owner("John" , "Johnson");
	              Owner owner2 = new Owner("Mary" , "Robinson");
	              orepository.save(owner1);
	              orepository.save(owner2);

	              // Add car object with link to owners and save these to db.
	              Car car = new Car("Ford", "Mustang", "Red", 
	                  "ADF-1121", 2017, 59000, owner1);
	              repository.save(car);
	              car = new Car("Nissan", "Leaf", "White",
	                  "SSJ-3002", 2014, 29000, owner2);
	              repository.save(car);
	              car = new Car("Toyota", "Prius", "Silver",
	                  "KKO-0212", 2018, 39000, owner2);
	              repository.save(car);

	          };

	}

}

