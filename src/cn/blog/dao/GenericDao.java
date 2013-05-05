package cn.blog.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 泛型DAO接口
 * @author lotusrootzb@gmail.com
 * 
 * @param <T> 实体类型
 * @param <ID> 实体ID的类型
 */
public interface GenericDao<T, ID extends Serializable> {
	/**
	 * 查找所有实体
	 * @return
	 */
	List<T> findAll();
	
	/**
	 * 通过实体id查找实体
	 * @param id 实体id
	 * @return
	 */
	T findById(ID id);
	
	/**
	 * 新增实体
	 */
	void insert(T entity);
	
	/**
	 * 修改实体
	 * @param entity
	 */
	void update(T entity);
	
	/**
	 * 删除实体
	 * @param entity
	 */
	void delete(T entity);
}
