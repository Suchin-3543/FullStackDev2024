package com.gentech.user.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.user.entity.User;
import com.gentech.user.service.UserService;


@RestController
@RequestMapping("/v1/api")
public class UserController {
	
	@Autowired
	private UserService useService;
	// http://localhost:9096/v1/api/user
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		return new ResponseEntity<User>(useService.createUser(user), HttpStatusCode.valueOf(201));
	}
	
	// http://localhost:9096/v1/api/cusers
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUser()
	{
		return new ResponseEntity<List<User>>(useService.getUsers(), HttpStatusCode.valueOf(200));
	}
	
	// http://localhost:9096/v1/api/user/{id}
	@GetMapping("/User/{id}")
	public ResponseEntity<User> getSpecificUser(@PathVariable("id") Long userId)
	{
		return new ResponseEntity<User>(useService.getUser(userId), HttpStatusCode.valueOf(200));
	}
	
	// http://localhost:9096/v1/api/user/{id}
	@PutMapping("/user/{id}")
	public ResponseEntity<User> modifySpecificUser(@PathVariable Long id, 
			@RequestBody User user)
	{
		return new ResponseEntity<User>(useService.updateUser(user, id), HttpStatusCode.valueOf(200));
	}
	
	// http://localhost:9096/v1/api/user/{id}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteSpecificUser(@PathVariable Long id)
	{
		useService.deleteUser(id);
		return new ResponseEntity<String>("The User id "+id+" has deleted successfully", HttpStatusCode.valueOf(200));
	}
	
}
