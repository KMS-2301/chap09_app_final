package org.edupoll.controller;

import org.edupoll.exception.NotExistUserException;
import org.edupoll.service.JWTService;
import org.edupoll.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user/private")
public class PrivateController {

	private final UserService userService;
	private final JWTService jwtService;
	
	@DeleteMapping
	public ResponseEntity<Void> deleteUserHandle(@RequestHeader String token) throws NotExistUserException {
		String emailTokenValue = jwtService.verifyToken(token);
		userService.deleteSpecificUser(emailTokenValue);
	
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
