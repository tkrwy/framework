package cn.ac.bcc.maque.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ac.bcc.maque.model.User;
import cn.ac.bcc.maque.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger LOGGER = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable String userId){
		LOGGER.info("查询用户:"  + userId);
		User user = userService.get(userId);
		modelMap.addAttribute("userInfo", user);
		return "/user/showInfo";
	}
	
	@RequestMapping("/showInfos")
	@ResponseBody
	public List<User> showUserInfos(){
		LOGGER.info("查询全部用户");
		List<User> users = userService.findAll();
		return users;
	}
}
