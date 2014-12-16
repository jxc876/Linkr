package com.mramirez.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mramirez.model.User;

@Service
@Transactional
public class RegistrationService {

	public boolean registerNewAccount(User user) {
		return false;
	}

	public boolean deleteUser(long id) {
		return false;
	}

	public boolean sendActivationEmail(long id) {
		return false;
	}
	
	public boolean activateAccount(long id){
		return false;
	}
	
	public boolean deactivateAccount(long id){
		return false;
	}
}
