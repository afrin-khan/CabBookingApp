package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.AdminDao;
import com.cg.model.Admin;

@Service
public class IAdminRepository implements IAdminService
{
	
	@Autowired
	AdminDao Adao;
//	public List<Admin> viewAdmin() {
//
//		return adao.findAll();
//	}
	
	 public Admin insertAdmin(Admin admin) {
	    	return Adao.save(admin);
	    }
	 
	 public Admin updateAdmin(Admin admin) {
	    	return Adao.save(admin);
	    }

	 public Admin deleteAdmin(int id){
//		 Admin ad=null;
	    	if(Adao.existsById(id)) {
	    		
	    		//Optional<Admin> op= dao.findById(id);
	    		Admin ad= Adao.findById(id).get();
	    		Adao.deleteById(id);
	    		return ad;
	    		
	    	}
	    	return null;
	    	
	    	
		 
	 }
}


