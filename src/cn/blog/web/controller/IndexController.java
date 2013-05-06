package cn.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 博客首页
 * 
 * @author lotusrootzb@gmail.com
 * 
 */
@Controller
public class IndexController {
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}
