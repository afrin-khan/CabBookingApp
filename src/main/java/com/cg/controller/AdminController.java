package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Admin;
import com.cg.service.IAdminRepository;

@RestController
public class AdminController
{

	
	@Autowired
	IAdminRepository AS;
    
//    @GetMapping("/viewAdmin")
//    public List<Admin> viewAdmin() {
//        return AS.viewAdmin();
//    }       
   @PostMapping("/insertadmin")   
   public Admin insertAdmin(@RequestBody Admin admin)
   {
       return AS.insertAdmin(admin);    
       }
   
  @PutMapping("/updateadmin")
  public Admin updateAdmin(@RequestBody Admin admin) 
  {
     return AS.updateAdmin(admin);
  }
    @DeleteMapping("/deladmin/{id}")
    public Admin deleteAdmin(@PathVariable("id") int adminId) {
        return AS.deleteAdmin(adminId);
    }
}
