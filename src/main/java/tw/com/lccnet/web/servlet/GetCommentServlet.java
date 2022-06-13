package tw.com.lccnet.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.lccnet.web.dao.CommentDao;
import tw.com.lccnet.web.dao.impl.CommentDaoImpl;
import tw.com.lccnet.web.db.DBconn;
import tw.com.lccnet.web.utils.UserSetComment;

@WebServlet("/getCommentServlet")
public class GetCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		CommentDao dao =new CommentDaoImpl(DBconn.getDB().getConnection());
		List<UserSetComment> comment=dao.getComment();
		request.setAttribute("comment", comment);
		
		request.getRequestDispatcher("comment.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
