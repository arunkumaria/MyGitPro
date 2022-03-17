package com.te.myfitnessapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.myfitnessapp.dao.AdminDao;
import com.te.myfitnessapp.dao.UserDao;
import com.te.myfitnessapp.dto.GymCoach;
import com.te.myfitnessapp.dto.GymNotification;
import com.te.myfitnessapp.dto.GymPlan;
import com.te.myfitnessapp.dto.GymProduct;
import com.te.myfitnessapp.dto.UserAccessBean;
import com.te.myfitnessapp.dto.UserRegisterBean;
import com.te.myfitnessapp.service.UserService;

@RestController
@RequestMapping("/gymadmin")
public class AdminController {

	@Autowired
	AdminDao adminDao;
	
	@Autowired
	UserService userService;

	@Autowired
	UserDao userDao;


	@GetMapping("/userRegister")
	public String userRegister() {
		System.out.println("runnings");
		return "demo";
	}

	@PostMapping(path = "/adminupdate")

	public void userValidate(@RequestBody UserRegisterBean userSignUpBean) {

		System.out.println("user bean entry");

		String name = userSignUpBean.getName();
		String uname = userSignUpBean.getUsername();
		String email = userSignUpBean.getEmail();
		Long pno = userSignUpBean.getPhno();
		Double height = userSignUpBean.getHeight();
		Double weight = userSignUpBean.getWeight();

		userSignUpBean.setName(name);
		userSignUpBean.setUsername(uname);
		userSignUpBean.setEmail(email);
		userSignUpBean.setPhno(pno);
		userSignUpBean.setHeight(height);
		userSignUpBean.setWeight(weight);

		userService.addRegister(userSignUpBean);

	}



	@GetMapping(path = "/adminreadall")

	public ResponseEntity<?> readDetails() {
		System.out.println("product bean entry");

		List<UserRegisterBean> userRegisterBean = new ArrayList<UserRegisterBean>();
		userRegisterBean = (List<UserRegisterBean>) adminDao.findAll();

		return ResponseEntity.ok(userRegisterBean);

	}
	

	@PostMapping(path = "/adminread")

	public ResponseEntity<?> userproductdisplay(@RequestBody UserRegisterBean userRegisterBean) {
		System.out.println("product bean entry");

		if (userDao.findById(userRegisterBean.getId()) != null) {
			return ResponseEntity.ok(userRegisterBean);
		} else {
			return ResponseEntity.ok("user not found");
		}
	}




	@DeleteMapping(path = "/admindelete")
	public void adminDelete(@RequestBody UserRegisterBean userRegisterBean) {

		System.out.println("enters user validate");

		System.out.println(userRegisterBean.getName());

		String name = userRegisterBean.getName();
		String uname = userRegisterBean.getUsername();
		String email = userRegisterBean.getEmail();
		Long pno = userRegisterBean.getPhno();
		Double height = userRegisterBean.getHeight();
		Double weight = userRegisterBean.getWeight();

		userRegisterBean.setName(name);
		userRegisterBean.setUsername(uname);
		userRegisterBean.setEmail(email);
		userRegisterBean.setPhno(pno);
		userRegisterBean.setHeight(height);
		userRegisterBean.setWeight(weight);

		userService.deleteRegister(userRegisterBean);

	}

}
