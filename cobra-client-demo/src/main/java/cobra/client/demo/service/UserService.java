package cobra.client.demo.service;

import java.util.List;

import cobra.client.demo.common.Result;
import cobra.client.demo.model.User;
import cobra.client.demo.query.UserQuery;

public interface UserService {

	/**
	 * 基本插入
	 * 
	 * @return
	 */
	public Long addUser(User User)throws Exception;

	/**
	 * 根据主键查询
	 */
	public User getUserByKey(Long id)throws Exception;

	/**
	 * 根据主键批量查询
	 */
	public List<User> getUserByKeys(List<Long> idList)throws Exception;

	/**
	 * 根据主键删除
	 * 
	 * @return
	 */
	public Integer deleteByKey(Long id)throws Exception;

	/**
	 * 根据主键批量删除
	 * 
	 * @return
	 */
	public Integer deleteByKeys(List<Long> idList)throws Exception;

	/**
	 * 根据主键更新
	 * 
	 * @return
	 */
	public Integer updateUserByKey(User User)throws Exception;

	/**
	 * 根据条件查询分页查询
	 * 
	 * @param UserQuery
	 *            查询条件
	 * @return
	 */
	public Result<User> getUserListWithPage(UserQuery UserQuery)throws Exception;

	/**
	 * 根据条件查询
	 * 
	 * @param UserQuery
	 *            查询条件
	 * @return
	 */
	public List<User> getUserList(UserQuery UserQuery)throws Exception;


}
