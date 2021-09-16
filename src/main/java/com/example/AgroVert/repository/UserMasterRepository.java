package com.example.AgroVert.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.example.AgroVert.model.User;

import java.lang.String;

@Repository("userMasterRepository")
public interface UserMasterRepository extends JpaRepository<User, Long>{
	
	
	Optional<User> findByEmail(String email);
	
	@Query(value = "SELECT * from users WHERE username = ?", nativeQuery = true)
	User findExistingEmailId(String email);
	
	@Modifying
    @Query(value = "UPDATE users SET password = :password WHERE username = :emailId", nativeQuery = true)
	@Transactional
	void updatePassword(@Param("password") String password,@Param("emailId") String emailId);
	
	
	
}

