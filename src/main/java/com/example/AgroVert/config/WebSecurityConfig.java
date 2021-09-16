package com.example.AgroVert.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		String[] resources = new String[]{
   			 "/AgroVert/user/**","/css/**", "/images/**","/favicon.ico","/fonts/*","/js/**","static/js/*"
        };
		
		 http.csrf().disable().authorizeRequests()
		    .antMatchers(resources).permitAll()
			
				/*
				 * .antMatchers("/DogWalk/employee/**").permitAll()
				 * .antMatchers("/DogWalk/book/**").permitAll()
				 */
			.anyRequest().authenticated()
			.and()
			.formLogin().disable()
			
			.logout().permitAll()
			.and()
			.exceptionHandling().accessDeniedPage("/403")
			;
	
	}

			
}


