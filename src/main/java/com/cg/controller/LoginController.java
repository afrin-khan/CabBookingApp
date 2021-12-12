package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Login;
import com.cg.service.IDriverRepository;

@RestController
public class LoginController 
{
	@Autowired
	IDriverRepository LS;
	
//	 @PostMapping("/signIn")
//	 public Login signIn(@RequestBody Login login)
//     {
//    	return LS.signIn(login);
//    	 
//     }
//	 
//	 @PostMapping("/signUp")
//	 public Login signUp(@RequestBody Login login)
//     {
//
//		 return LS.signUp(login);
//    	 
//     }

}
