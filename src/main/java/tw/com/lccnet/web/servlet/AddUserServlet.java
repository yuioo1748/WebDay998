package tw.com.lccnet.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.lccnet.web.dao.UserDao;
import tw.com.lccnet.web.dao.impl.UserDaoImpl;
import tw.com.lccnet.web.db.DBconn;
import tw.com.lccnet.web.utils.User;

@WebServlet("/addUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		UserDao dao =new UserDaoImpl(DBconn.getDB().getConnection());
		User user=new User();
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		
		dao.addUser(user);
		response.sendRedirect("personalProfileServlet");
		System.out.println(request.getParameter("name"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
