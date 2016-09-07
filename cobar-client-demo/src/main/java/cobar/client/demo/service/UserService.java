package cobar.client.demo.service;

import java.util.List;

import cobar.client.demo.common.Result;
import cobar.client.demo.model.User;
import cobar.client.demo.query.UserQuery;

public interface UserService {

	/**
	 * �����
	 * 
	 * @return
	 */
	public Long addUser(User User)throws Exception;

	/**
	 * ��������ѯ
	 */
	public User getUserByKey(Long id)throws Exception;

	/**
	 * �������������ѯ
	 */
	public List<User> getUserByKeys(List<Long> idList)throws Exception;

	/**
	 * �������ɾ��
	 * 
	 * @return
	 */
	public Integer deleteByKey(Long id)throws Exception;

	/**
	 * �����������ɾ��
	 * 
	 * @return
	 */
	public Integer deleteByKeys(List<Long> idList)throws Exception;

	/**
	 * ����������
	 * 
	 * @return
	 */
	public Integer updateUserByKey(User User)throws Exception;

	/**
	 * ���������ѯ��ҳ��ѯ
	 * 
	 * @param UserQuery
	 *            ��ѯ����
	 * @return
	 */
	public Result<User> getUserListWithPage(UserQuery UserQuery)throws Exception;

	/**
	 * ���������ѯ
	 * 
	 * @param UserQuery
	 *            ��ѯ����
	 * @return
	 */
	public List<User> getUserList(UserQuery UserQuery)throws Exception;


}
