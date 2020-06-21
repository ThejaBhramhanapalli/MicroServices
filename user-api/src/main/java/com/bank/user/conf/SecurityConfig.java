package com.bank.user.conf;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.bank.user.domain.AuthUser;
import com.bank.user.exception.UserNotFoundException;
import com.bank.user.repo.AuthUserRepo;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	AuthUserRepo authUserRepo;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception 
    {
        http
         .csrf().disable()
         .authorizeRequests().anyRequest().authenticated()
         .and()
         .httpBasic();
    }
  
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception 
    {
    	
    	//Optional<AuthUser> authUserEntity = authUserRepo.findById("admin");
    	
    	//if(authUserEntity.isEmpty()) throw new UserNotFoundException("User Id does not exist!!");
    	
        auth.inMemoryAuthentication()
            .withUser("admin")
            .password("{noop}password")
            .roles("USER");
        
        
    }
	
}
