package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer> 
{

}
