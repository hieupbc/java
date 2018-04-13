package com.qlsv.service;

import java.util.List;

import com.qlsv.entities.User;

public interface UserService {

	List<User> getAllUser();

	boolean checkLogin(String username, String password);

}
