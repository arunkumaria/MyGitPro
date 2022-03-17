
package com.te.myfitnessapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.te.myfitnessapp.dao.AdminDao;
import com.te.myfitnessapp.dao.UserDao;
import com.te.myfitnessapp.dto.UserAccessBean;
import com.te.myfitnessapp.dto.UserRegisterBean;
import com.te.myfitnessapp.service.UserService;

@RestController
@RequestMapping("/gymuser")

public class UserController {

	@Autowired
	AdminDao adminDao;

	@Autowired
	UserService userService;

	@Autowired
	UserDao userDao;

	int count = 1;

	@PostMapping(path = "/userregister")
	public String userValidates(@RequestBody UserRegisterBean userRegisterBean) {

		System.out.println("user bean entry");

		Integer id = userRegisterBean.getId();
		String name = userRegisterBean.getName();
		String uname = userRegisterBean.getUsername();
		String email = userRegisterBean.getEmail();
		Long pno = userRegisterBean.getPhno();
		Double height = userRegisterBean.getHeight();
		Double weight = userRegisterBean.getWeight();

		userRegisterBean.setId(id);
		userRegisterBean.setName(name);
		userRegisterBean.setUsername(uname);
		userRegisterBean.setEmail(email);
		userRegisterBean.setPhno(pno);
		userRegisterBean.setHeight(height);
		userRegisterBean.setWeight(weight);

		if (adminDao.findById(userRegisterBean.getId()).isEmpty() == true) {
			if (userService.addRegister(userRegisterBean) == true) {

				return "user registered successfully";

			} else {
				return "user not registered";
			}
		} else {
			return "user already registered";
		}

	}

	@PostMapping("/userlogin")
	public String login(@RequestBody UserRegisterBean userRegisterBean) {

		if (adminDao.findById(userRegisterBean.getId()).isEmpty() == false) {
			count = 1;
			return "login successfull";
		}
		return "login unsuccessfull";
	}

	@PostMapping(path = "/useradd")

	public String userproductadd(@RequestBody UserAccessBean userAccessBean) {

		if (userDao.findById(userAccessBean.getuId()) != null) {
			userDao.save(userAccessBean);
			return "success";

		} else {
			return "failure";
		}

	}

	@GetMapping(path = "/userread")

	public ResponseEntity<?> userproductdisplay(@RequestBody UserAccessBean UserAccessBean) {
		System.out.println("product bean entry");

		if (userDao.findById(UserAccessBean.getuId()) != null) {
			return ResponseEntity.ok(UserAccessBean);
		} else {
			return ResponseEntity.ok("user not found");
		}
	}

}
