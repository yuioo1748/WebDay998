package tw.com.lccnet.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tw.com.lccnet.web.dao.UserDao;
import tw.com.lccnet.web.utils.User;

public class UserDaoImpl implements UserDao {
	private Connection conn;
	private PreparedStatement ps;
	private String query;
	private ResultSet rs;
	
	public UserDaoImpl(Connection conn) {
		this.conn=conn;
	}
	
	@Override
	public User userlogin(String email, String password) {
		
		User user= null;
		
		try {
			query="select * from users where email=? and password=?";
			ps=this.conn.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				user= new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void addUser(User user) {
		try {
			query="insert into users(name,email,password) values (?,?,?); ";
			ps=this.conn.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
