package cn.blog.service;

import java.util.List;

import cn.blog.domain.User;

/**
 * 用户业务逻辑接口
 * 
 * @author lotusrootzb@gmail.com
 * 
 */
public interface UserService {
	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	List<User> findAllUser();
}
