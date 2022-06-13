package tw.com.lccnet.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tw.com.lccnet.web.dao.CommentDao;
import tw.com.lccnet.web.utils.UserSetComment;

public class CommentDaoImpl implements CommentDao {
	private Connection conn;
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;

	public CommentDaoImpl(Connection conn) {
		this.conn = conn;
	}

	/*
	 * 送入資料庫
	 */
	@Override
	public void setComment(UserSetComment uscomment) {
		try {
			query = "insert into comment(email,comment,pic)values(?,?,?);";
			ps = this.conn.prepareStatement(query);
			ps.setString(1, uscomment.getEmail());
			ps.setString(2, uscomment.getComment());
			ps.setString(3, uscomment.getPic());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(uscomment.getEmail());
		System.out.println(uscomment.getComment());
		System.out.println(uscomment.getPic());
	}
	
	/*
	 * 從資料庫拉取
	 */
	@Override
	public List<UserSetComment> getComment() {
		List<UserSetComment> comment = new ArrayList<UserSetComment>();
		try {
			query = "select * from comment order by id asc";
			ps = this.conn.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				UserSetComment row = new UserSetComment();
				row.setId(rs.getInt("id"));
				row.setEmail(rs.getString("email"));
				row.setComment(rs.getString("comment"));
				row.setPic(rs.getString("pic"));

				comment.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return comment;
	}
}
