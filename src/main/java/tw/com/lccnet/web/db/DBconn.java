package tw.com.lccnet.web.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconn {
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/webday998?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
	private final String JDBC_USERNAME = "root";
	private final String JDBC_USERPASS = "Password123";
	private Connection conn = null;

	private DBconn() {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static DBconn getDB() {
		return new DBconn();
	}

	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_USERPASS);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void close(PreparedStatement ps) {
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void close(Statement st) {
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void close(ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
