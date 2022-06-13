package tw.com.lccnet.web.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.lccnet.web.utils.FirstPersonInfo;
import tw.com.lccnet.web.utils.PersonalProfile;

@WebServlet("/personalProfileServlet")
public class PersonalProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<FirstPersonInfo> firstp = Arrays.asList(
			new FirstPersonInfo("解庚霖", "中國文化大學", "生命科學系(生物相關學系) 大學畢業", "台北市士林區", "無工作經驗")
			);
	
	List<PersonalProfile> personlist = Arrays.asList
			(new PersonalProfile("pic/pic1.jpg",
					"男 、 26歲 、 免役", "待業中", "0981-778-007", "ryeoo1748@gmail.com", "台北市士林區忠誠路***", "Keng Lin Hsieh"));
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("firstp", firstp);
		request.setAttribute("personlist", personlist);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
