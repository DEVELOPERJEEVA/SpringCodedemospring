package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerJpaUser {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/jpa/getusers")
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
	@GetMapping("/jpa/getoneusers/{id}")
	public Optional<User>getOneUser(@PathVariable int id)
	{
		Optional<User> u=userRepository.findById(id);
		return u;
	}
	
	@PostMapping("/jpa/postUser")
	public String addUser(@RequestBody User u) {
		userRepository.save(u) ;
		return "successfully added";
		
	}
	
	@DeleteMapping("/jpa/deleteuser/{id}")
	public void deleteUser(@PathVariable int id) 
	{
		userRepository.deleteById(id);
		System.out.println("successfully deleted");
	}
}
