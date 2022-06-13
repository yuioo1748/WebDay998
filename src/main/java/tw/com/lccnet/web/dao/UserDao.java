package tw.com.lccnet.web.dao;

import tw.com.lccnet.web.utils.User;

public interface UserDao {
	
	public User userlogin(String email,String password);
	
	public void addUser(User user);
}
