package com.te.myfitnessapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.myfitnessapp.dao.AdminDao;
import com.te.myfitnessapp.dao.UserDao;
import com.te.myfitnessapp.dto.UserAccessBean;
import com.te.myfitnessapp.dto.UserRegisterBean;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private AdminDao adminDao;

	@Autowired
	private UserDao userDao;

	// adding & updating

	@Override
	public boolean addRegister(UserRegisterBean userRegisterBean) {

		if (userRegisterBean.getId() == 0 || userRegisterBean.getName() == null
				|| userRegisterBean.getUsername() == null || userRegisterBean.getEmail() == null
				|| userRegisterBean.getPhno() == 0 || userRegisterBean.getHeight() == 0.0
				|| userRegisterBean.getWeight() == 0.0) {
			System.out.println("failure");
			return false;

		} else {

			adminDao.save(userRegisterBean);
			return true;

		}

	}

	@Override
	public boolean addProduct(UserAccessBean userAccessBean) {
		if (userAccessBean.getuId() == 0 || userAccessBean.getGymProduct() == null) {
			System.out.println("failure");
			return false;

		} else {
			System.out.println("success");
			userDao.save(userAccessBean);
			return true;

		}
	}

	// reading

	@Override
	public boolean readRegister() {

		if (adminDao.findAll() != null) {
			return true;
		} else {

			return false;

		}
	}

	@Override
	public boolean readProducts() {

		if (userDao.findAll() != null) {
			return true;

		} else {

			return false;

		}

	}

//deleting

	@Override
	public void deleteRegister(UserRegisterBean userRegisterBean) {

		if (adminDao.findById(userRegisterBean.getId()).isEmpty()) {
			System.out.println("failure");

		} else {

			adminDao.deleteById(userRegisterBean.getId());
			System.out.println("success");

		}

	}

}
