package tw.com.lccnet.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.lccnet.web.dao.UserDao;
import tw.com.lccnet.web.dao.impl.UserDaoImpl;
import tw.com.lccnet.web.db.DBconn;
import tw.com.lccnet.web.utils.User;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		try(PrintWriter out=response.getWriter()) {
			String email = request.getParameter("login-email");
			String password = request.getParameter("login-password");

			UserDao dao = new UserDaoImpl(DBconn.getDB().getConnection());
			User user = dao.userlogin(email, password);
			
			if(user != null) {
				request.getSession().setAttribute("auth", user);
				response.sendRedirect("personalProfileServlet");
				System.out.println("OK");
			}else {
				response.sendRedirect("login.jsp");
				System.out.println("no");
			}
		} catch (Exception e) {
		}
	}

}
