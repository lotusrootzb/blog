package cn.blog.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.blog.dao.GenericDao;

/**
 * 使用Mybatis实现泛型DAO接口
 * 
 * @author lotusrootzb@gmail.com
 * 
 * @param <T>
 *            实体类型
 * @param <ID>
 *            实体ID的类型
 */
public class GenericMybatisDao<T, ID extends Serializable> implements
		GenericDao<T, ID> {
	private Class<T> persistentClass;
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	private static final String FINDALL = ".findAll";
	private static final String SELECTONE = ".selectOne";
	private static final String INSERT = ".insert";
	private static final String UPDATE = ".update";
	private static final String DELETE = ".delete";

	@SuppressWarnings("unchecked")
	public GenericMybatisDao() {
		persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public List<T> findAll() {
		return sqlSessionFactory.openSession().selectList(
				getPersistentClass().getName() + FINDALL);
	}

	public T findById(ID id) {
		return sqlSessionFactory.openSession().selectOne(
				getPersistentClass().getName() + SELECTONE, id);
	}

	public void insert(T entity) {
		sqlSessionFactory.openSession().insert(
				getPersistentClass().getName() + INSERT, entity);
	}

	public void update(T entity) {
		sqlSessionFactory.openSession().insert(
				getPersistentClass().getName() + UPDATE, entity);
	}

	public void delete(T entity) {
		sqlSessionFactory.openSession().insert(
				getPersistentClass().getName() + DELETE, entity);
	}

	// -- Getter && Setter
	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

}