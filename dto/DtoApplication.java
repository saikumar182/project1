package com.example.dto;

import com.example.dto.Repository.LocationRepo;
import com.example.dto.Repository.UserRepo;
import com.example.dto.model.Location;
import com.example.dto.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoApplication implements CommandLineRunner {

	public static void main(String[] args) {


		SpringApplication.run(DtoApplication.class, args);
	}


	@Autowired

	private UserRepo userRepo;

	@Autowired
private LocationRepo  locationRepo ;


	@Override
	public void run(String... args) throws Exception {


		Location location = new Location();

		location.setPlace("vizag");
		location.setDescription("city of destiny");
		location.setLongitude(69.7);
		location.setLatitude(34.5);

		locationRepo.save(location);

		User user1= new User();

		user1.setEmail("sai@gmail.com");
		user1.setFirstname("sai");
		user1.setLastname("kumar");
		user1.setPassword("viratsai");
		user1.setLocation(location);

		userRepo.save(user1);


	}
}
