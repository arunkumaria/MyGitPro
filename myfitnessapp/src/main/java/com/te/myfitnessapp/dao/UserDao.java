package com.te.myfitnessapp.dao;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.myfitnessapp.dto.UserAccessBean;
import com.te.myfitnessapp.dto.UserRegisterBean;

@Repository
public interface UserDao extends CrudRepository<UserAccessBean,Integer>{
	
	
}
