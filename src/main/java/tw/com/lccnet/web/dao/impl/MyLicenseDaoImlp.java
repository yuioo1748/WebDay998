package tw.com.lccnet.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tw.com.lccnet.web.dao.MyLicenseDao;
import tw.com.lccnet.web.utils.MyLicense;

public class MyLicenseDaoImlp implements MyLicenseDao {
	private Connection conn;
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public MyLicenseDaoImlp(Connection conn) {
		this.conn=conn;
	}
	
	
	@Override
	public List<MyLicense> getAllLicense() {
		List<MyLicense> licenses= new ArrayList<MyLicense>();
		try {
			query="select * from licenses order by id desc";
			ps=this.conn.prepareStatement(query);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				MyLicense row =new MyLicense();
				row.setId(rs.getInt("id"));
				row.setName(rs.getString("name"));
				row.setPic(rs.getString("pic"));
				licenses.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return licenses;
	}

}
