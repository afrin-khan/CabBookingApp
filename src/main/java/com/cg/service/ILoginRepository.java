package com.cg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.LoginDao;
import com.cg.model.ApiResponse;
import com.cg.model.Login;
import com.cg.model.User;

@Service
public class ILoginRepository implements ILoginService
{
     @Autowired
	LoginDao ldao;
     
     
//	    public ApiResponse login(Login login) {
//	        Optional<Login> l = ldao.findById(login.getUserId());
//	        if(l == null)
//	        {
//	            throw new RuntimeException("User does not exist.");
//	        }
//	        if(!l.getPassword().equals(login.getPassword())){
//	            throw new RuntimeException("Password mismatch.");
//	        }
//	        return new ApiResponse(200, "Login success", null) ;
//
//	    }

//	    private void validateSignUp(SignUpDto signUpDto) {
//	    }
     
//     public Login signIn(Login login)
//     {
//    	 Login l1=null;
//    	 int  userId=login.getUserId();
//    	 if(ldao.existsById(userId))
//    	 {
//    		 l1=ldao.findById(userId).get();
//    		 return l1;
//    	 }
//    	 else 
//    		 return null;
//    	 
//     }
//     
//     
// 	public Login signUp(Login login)
// 	 {
//   	 Login l1=null;
//   	 int  userId=login.getUserId();
//   	 if(ldao.existsById(userId))
//   	 {
//   		 l1=ldao.findById(userId).get();
//   		 return l1;
//   	 }
//   	 else 
//   		 return null;
//   	 
//    }
	
}
