package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
ApplicationContext context = 		SpringApplication.run(BootJpaExampleApplication.class, args);
UserRepository repository = 	context.getBean(UserRepository.class);

	User user = new User();
	user.setName("Prink");
	user.setCity("Delhi");
	user.setStatus("java developer");
	
User user2 = 	repository.save(user);
System.out.println(user2);
	





	}

}
