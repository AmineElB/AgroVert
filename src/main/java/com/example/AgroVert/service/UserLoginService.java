package com.example.AgroVert.service;

import java.util.List;
import java.util.Optional;

import com.example.AgroVert.model.User;

public interface UserLoginService {
	public User validateUser(String email, String password);
	
	public Optional<User> isUserExist(String emailId);
	
	
	public void save(User user);
	
	public List<User> listAll();
	
	public User get(Long id);
	
	public Boolean updateUser(String password, String emailId);
	
		
	public void delete(Long id);
	
	
	
}
