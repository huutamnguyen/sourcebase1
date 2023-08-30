package com.example.demo.payload.user;

import lombok.Data;

@Data
public class LoginResponse {
	private int statusCode;
	private String message;
	private String token;
}
