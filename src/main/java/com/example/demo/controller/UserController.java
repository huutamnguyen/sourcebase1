package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.payload.user.LoginRequest;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "${api.url.login}", method = RequestMethod.POST)
	public ResponseEntity<String> login(@Valid @RequestBody LoginRequest request) {
		System.out.println(request.getEmail());
		return ResponseEntity.ok("ok");
	}
}
