package br.com.appbarbearia.services;

import org.springframework.stereotype.Service;

import br.com.appbarbearia.repositories.UserRepository;

@Service
public class UserService {
	
	final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
}
