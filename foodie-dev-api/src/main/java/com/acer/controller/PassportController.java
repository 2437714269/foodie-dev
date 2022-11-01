package com.acer.controller;

import com.acer.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author acer
 */

@RestController()
//@RequiredArgsConstructor
public class TestController {

	@Autowired
	private UserServiceImpl userService;


	@GetMapping("/save")
	public boolean saveName(String username){
		return userService.queryUsernameIsExist(username);
	}
}
