package com.example.AgroVert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.AgroVert.model.Role;
import com.example.AgroVert.serviceImpl.RoleService;



@SpringBootApplication
public class AgroVertApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AgroVertApplication.class, args);
	}
	
	@Autowired
	RoleService roleService;
	
	@Override
	public void run(String... args) throws Exception {
		Role role1 = new Role();
		role1.setId(1);
		role1.setName("USER");
		roleService.save(role1);
				 
		Role role2 = new Role();
		role2.setId(2);
		role2.setName("ADMIN");
		roleService.save(role2);
		
		
				  
		
	}

}
