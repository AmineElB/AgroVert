package com.example.AgroVert.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AgroVert.model.Role;
import com.example.AgroVert.repository.RoleRepository;




@Service("roleService")
public class RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	

	public Optional<Role> findByRoleId(int id){
		
		return roleRepository.findById(id);
	}
	
	
public Role save(Role role) {
    	
	Optional<Role> roleDbOptional = roleRepository.findById(role.getId());
    	if(roleDbOptional.isPresent()){
    		return role;
    	}else{
    		return roleRepository.save(role);
    	}
    }
}
