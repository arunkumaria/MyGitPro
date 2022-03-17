package com.te.myfitnessapp.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.myfitnessapp.dto.UserRegisterBean;


@Repository
public interface AdminDao extends CrudRepository<UserRegisterBean,Integer>{

	
}
