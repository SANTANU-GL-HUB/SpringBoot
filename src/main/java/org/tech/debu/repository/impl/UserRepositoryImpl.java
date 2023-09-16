package org.tech.debu.repository.impl;

import org.tech.debu.model.User;
import org.tech.debu.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@Override
	public User userGetRepo(String id) {
		
		return null;
	}

	@Override
	public User userAddRepo(User user) {
		
		return null;
	}

	@Override
	public User userUpdateRepo(String id, User user) {
		
		return null;
	}

	@Override
	public String userRemoveRepo(String id) {
		
		return null;
	}

}
