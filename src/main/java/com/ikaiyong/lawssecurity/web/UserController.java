/**
 * 
 */
package com.ikaiyong.lawssecurity.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhailiang
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {


	@GetMapping("/me")
	public Object getCurrentUser(Authentication user, HttpServletRequest request) {
		return user;
	}
}
