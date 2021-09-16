package com.example.AgroVert.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AgroVert.model.User;
import com.example.AgroVert.repository.UserMasterRepository;
import com.example.AgroVert.service.UserLoginService;



@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService{
	@Autowired
	private UserMasterRepository userMasterRepository;
	
	
	@Override
	public User validateUser(String email, String password) {
		Optional<User> userOptional = userMasterRepository.findByEmail(email);
		
		User user = null;
		String dbPassword = null;
		User dbuser = null;
		
		if(userOptional.isPresent()) {
			dbuser = userOptional.get();
			dbPassword = dbuser.getPassword();
			}
		
		if(password.equals(dbPassword)) {
			
			user = dbuser;
			
			return user;
		}else {
			return user;
		}
	}
	
	public Optional<User> isUserExist(String emailId) {
		Optional<User> um = userMasterRepository.findByEmail(emailId);
		
			return um;
		
	}
	@Override
	public void save(User user) {
		userMasterRepository.save(user);
	}
	
	public List<User> listAll() {		
		return userMasterRepository.findAll();
	}

	public User get(Long id) {
		return userMasterRepository.findById(id).get();
	}

	@Override
	public Boolean updateUser(String password, String emailId) {
		userMasterRepository.updatePassword(password, emailId);
		return true;
	}
	
	
	
	public void delete(Long id) {
		userMasterRepository.deleteById(id);
	}

	
}

