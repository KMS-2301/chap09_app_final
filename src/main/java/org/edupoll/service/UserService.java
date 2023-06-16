package org.edupoll.service;

import org.edupoll.model.dto.request.CreateUserRequest;
import org.edupoll.model.entity.User;

import jakarta.transaction.Transactional;

public class UserService {
	
	@Transactional
	public void saveUser(CreateUserRequest req) {
		User user = new User();
		

	}
}
