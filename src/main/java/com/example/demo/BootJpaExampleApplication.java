package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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


//Save the user

//	User user = new User();
//	user.setName("Prink");
//	user.setCity("Delhi");
//	user.setStatus("java developer");
//	
//User user2 = 	repository.save(user);
//System.out.println(user2);
	

//User user1 = new User();
//user1.setName("uttam45");
//user1.setCity("Delhi");
//user1.setStatus("pyhton programmer");
//
//User user2 = new User();
//user2.setName("nAVEEN12");
//user2.setCity("Mumbai");
//user2.setStatus(".net programmer");
//
//
//User user3 = new User();
//user3.setName("uttam45");
//user3.setCity("Delhi");
//user3.setStatus("pyhton programmer");
//
//
//List<User> user = new ArrayList<User>();
//user.add(user1);
//user.add(user2);
//user.add(user3);
//	Iterable<User> result = 	repository.saveAll(user);
//	
//result.forEach(user4->{
//	System.out.println(user);
//});



//update the User
	

// Optional<User> optional = repository.findById(6) ;
// 
// User user = optional.get();
// //System.out.println(user);
// 
//    user.setName("NANDU");
// 
//  User result = repository.save(user);
//  System.out.println(result);


//FindAll


Iterable<User> user =    repository.findAll();

user.forEach(user1-> System.out.println(user1));

 
 
 

}

}
