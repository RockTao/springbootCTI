package com.imooc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;

//@Controller
@RestController    // @RestController    = @ResponseBody +@Controller 
@RequestMapping("/user")
public class UserController {
	
	
	@RequestMapping("/getUser")
//	@ResponseBody
	public User hello() {
		User user= new User();
		user.setName("imooc");
		user.setAge(18);
		user.setBirthday(new Date());
		user.setPassword("Imooc");
		user.setDesc("Hello  world~~~~~~~");
		return user;
	}
	
	@RequestMapping("/getUserJson")
//	@ResponseBody
	public IMoocJSONResult getUserJson() {
		User user= new User();
		user.setName("imooc——22222");
		user.setAge(18);
		user.setBirthday(new Date());
		user.setPassword("Imooc");
		user.setDesc("Hello  world~~~~~~~");
		return IMoocJSONResult.ok(user);
	}

}
