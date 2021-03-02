package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	//Predefine
	
	//findall
	//save
//delete
	//findById
	
	
	
	//derived queries/custom methods
	
	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name,String city);
	
	
	//jpql query
	
	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	@Query("select u FROM User u WHERE u.name= :n")
	public List<User> getUserByName(@Param("n") String n);
	
	@Query("select u FROM User u WHERE u.name= :n and u.city= :c")
	public List<User> getUserByNameAndCity(@Param("n") String n,@Param("c")String c);
	
	
	//native query
	
	@Query(value = "select * from user",nativeQuery = true)
	public List<User> getUsers();
	
	
}
