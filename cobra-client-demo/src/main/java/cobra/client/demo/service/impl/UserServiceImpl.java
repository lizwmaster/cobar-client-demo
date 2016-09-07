package cobra.client.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import cobra.client.demo.common.Result;
import cobra.client.demo.dao.UserDAO;
import cobra.client.demo.model.User;
import cobra.client.demo.query.UserQuery;
import cobra.client.demo.service.UserService;

public class UserServiceImpl implements UserService {

	@Resource
	private UserDAO userDao;

	@Override
	public Long addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public User getUserByKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return userDao.getUserByKey(id);
	}

	@Override
	public List<User> getUserByKeys(List<Long> idList) throws Exception {
		// TODO Auto-generated method stub
		return userDao.getUserByKeys(idList);
	}

	@Override
	public Integer deleteByKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return userDao.deleteByKey(id);
	}

	@Override
	public Integer deleteByKeys(List<Long> idList) throws Exception {
		// TODO Auto-generated method stub
		return userDao.deleteByKeys(idList);
	}

	@Override
	public Integer updateUserByKey(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.updateUserByKey(user);
	}

	@Override
	public Result<User> getUserListWithPage(UserQuery userQuery) throws Exception {
		// TODO Auto-generated method stub
		return userDao.getUserListWithPage(userQuery);
	}

	@Override
	public List<User> getUserList(UserQuery userQuery) throws Exception {
		// TODO Auto-generated method stub
		return userDao.getUserList(userQuery);
	}
	
}
