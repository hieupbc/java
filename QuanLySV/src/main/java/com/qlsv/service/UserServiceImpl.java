package com.qlsv.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlsv.entities.User;
import com.qlsv.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public List<User> getAllUser() {
		List<User> list = new ArrayList<>();
		userRepository.findAll().forEach(User -> list.add(User));
		return list;
	}

	@Override
	@Transactional
	public boolean checkLogin(String username, String password) {
		List<User> users = getAllUser();
		for (User user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;

	}

}
