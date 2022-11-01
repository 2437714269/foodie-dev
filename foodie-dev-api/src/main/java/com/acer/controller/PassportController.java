package com.acer.controller;

import com.acer.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author acer
 */

@RestController
@RequiredArgsConstructor
@Slf4j
public class PassportController {

	private final UserService userService;


	@GetMapping("/save")
	public int saveName(@RequestParam String username){
		log.info("用户名：{}",username);
		if (StringUtils.isBlank(username)){
			return 501;
		}
		boolean isExist = userService.queryUsernameIsExist(username);
		if (!isExist){
			return 500;
		}
		return 200;
	}
}
