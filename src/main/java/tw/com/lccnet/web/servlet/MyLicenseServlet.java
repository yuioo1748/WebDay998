package tw.com.lccnet.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.lccnet.web.dao.MyLicenseDao;
import tw.com.lccnet.web.dao.impl.MyLicenseDaoImlp;
import tw.com.lccnet.web.db.DBconn;
import tw.com.lccnet.web.utils.MyLicense;

@WebServlet("/myLicenseServlet")
public class MyLicenseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MyLicenseDao dao = new MyLicenseDaoImlp(DBconn.getDB().getConnection());
		List<MyLicense> license = dao.getAllLicense();
		request.setAttribute("license", license);

		request.getRequestDispatcher("mylicense.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
