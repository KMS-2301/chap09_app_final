package org.edupoll.controller;

import org.edupoll.model.dto.request.CreateUserRequest;
import org.edupoll.model.dto.request.LoginRequest;
import org.edupoll.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

	private final UserService userService;

	@PostMapping("/join")
	public ResponseEntity<Void> joinUserHandle(@Validated CreateUserRequest request) {

	}

	@PostMapping("/login")
	public ResponseEntity<Void> loginUserHandle(@Validated LoginRequest request) {

	}

}




