package cobar.client.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cobar.client.demo.common.Result;
import cobar.client.demo.dao.UserDAO;
import cobar.client.demo.model.User;
import cobar.client.demo.query.UserQuery;
import cobar.client.demo.service.UserService;

@Service("userService")
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
