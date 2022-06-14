package com.zensar.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.User;
import com.zensar.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@PostMapping(value = "/adduser")
	public User f1(@RequestBody User user) {
		return this.service.addUser(user);
	}

}