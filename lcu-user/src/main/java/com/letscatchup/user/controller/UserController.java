package com.letscatchup.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letscatchup.user.domain.entity.UserEntity;
import com.letscatchup.user.service.UserService;


@RestController
@RequestMapping("/user")
//@ExceptionHandler(value = Exception.class) : replace with a global exception handling mechanism
@CrossOrigin(origins = "http://localhost:8091")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method= RequestMethod.POST)
	public void addUser(@RequestBody UserEntity userEntity) {
		userService.addUser(userEntity);
		
	}
	
	@RequestMapping(value = "/", method= RequestMethod.PUT)
	public void updateUser(@RequestBody UserEntity userEntity) {
		userService.updateUser(userEntity);
		
	}
	
	@RequestMapping(value = "/{userId}", method= RequestMethod.DELETE)
	public void deleteUser(@PathVariable(name="userId") Long userId) {
		userService.deleteUser(userId);
		
	}
	
	@RequestMapping(value = "/{userId}", method= RequestMethod.GET)
	public UserEntity getUser(@PathVariable(name="userId") Long userId) {
		return userService.loadUser(userId);
		
	}
}
