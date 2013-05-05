package cn.blog.dao.impl;

import org.springframework.stereotype.Repository;

import cn.blog.dao.UserDao;
import cn.blog.domain.User;

@Repository
public class UserDaoImpl extends GenericMybatisDao<User, Long> implements
		UserDao {

}
