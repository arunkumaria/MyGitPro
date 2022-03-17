package com.te.myfitnessapp.service;

import com.te.myfitnessapp.dto.UserAccessBean;
import com.te.myfitnessapp.dto.UserRegisterBean;

public interface UserService {

	public boolean addRegister(UserRegisterBean userRegisterBean);
	public boolean addProduct(UserAccessBean userAccessBean);
	public boolean readRegister();
	public boolean readProducts();
	public void deleteRegister(UserRegisterBean userRegisterBean);

}
