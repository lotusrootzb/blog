package cn.blog.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.blog.domain.User;
import cn.blog.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String users(Model model) {
		List<User> users = userService.findAllUser();
		model.addAttribute("users", users);
		return "user/users";
	}

	@RequestMapping(value = "/json", method = RequestMethod.GET)
	@ResponseBody
	public List<User> json() {
		return userService.findAllUser();
	}
}
