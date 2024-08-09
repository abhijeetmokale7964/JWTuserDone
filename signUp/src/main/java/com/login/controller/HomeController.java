package com.login.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.entities.User;
import com.login.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;

    

    @RequestMapping("/users")
    public List<User>getUser() {
    	
    	System.out.println("Getting Users.");
    	
    	return userService.getUsers();
        
    }
    @GetMapping("/current_user")
    public String getLoggedInUser(Principal principal) {
    	return principal.getName();
    }


}