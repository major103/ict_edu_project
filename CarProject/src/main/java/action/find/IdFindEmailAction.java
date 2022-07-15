package action.find;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import vo.UserVo;

/**
 * Servlet implementation class IdFindPhoneAction
*/
@WebServlet("/user/id_find_email.do")
public class IdFindEmailAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String u_name = request.getParameter("name");
		System.out.println(u_name);
		String p_email_f = request.getParameter("p_email_f");
		String p_email_b = request.getParameter("p_email_b");
		
		String u_email = p_email_f + "@" + p_email_b;
		System.out.println(u_email);
		
		Map map = new HashMap();
		
		map.put("u_name", u_name);
		map.put("u_email", u_email);
		
		UserVo user = UserDao.getInstance().selectOne2(map);
		
		request.setAttribute("user", user);
		

		//forward
		String forward_page = "id_find_phone.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(forward_page);
		disp.forward(request, response);
	}

}

