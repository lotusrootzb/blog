package cn.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.blog.dao.UserDao;
import cn.blog.domain.User;
import cn.blog.service.UserService;

/**
 * 用户业务逻辑实现
 * 
 * @author lotusrootzb@gmail.com
 * 
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public List<User> findAllUser() {
		return userDao.findAll();
	}

}
