package cobra.client.demo.dao;

import java.sql.SQLException;
import java.util.List;

import cobra.client.demo.common.Result;
import cobra.client.demo.model.User;
import cobra.client.demo.query.UserQuery;

public interface UserDAO {
	
	public Long addUser(User user) throws SQLException;
	
	public User getUserByKey(Long id) throws SQLException;
	
	public List<User> getUserByKeys(List<Long> idList) throws SQLException;
	
	public Integer deleteByKey(Long id) throws SQLException;
	
	public Integer deleteByKeys(List<Long> idList) throws SQLException;
	
	public Integer updateUserByKey(User user) throws SQLException;
	
	public Result<User> getUserListWithPage(UserQuery userQuery);
	
	public List<User> getUserList(UserQuery userQuery) throws SQLException;
}
