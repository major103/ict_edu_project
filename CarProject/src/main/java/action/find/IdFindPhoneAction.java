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
@WebServlet("/user/id_find_phone.do")
public class IdFindPhoneAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String u_name = request.getParameter("name");
		String phone_front = request.getParameter("phone_front");
		String phone_center = request.getParameter("phone_center");
		String phone_end = request.getParameter("phone_end");
		
		String u_phone = phone_front + "-" + phone_center + "-" + phone_end;

		Map map = new HashMap();
		
		map.put("u_name", u_name);
		map.put("u_phone", u_phone);
		
		UserVo user = UserDao.getInstance().selectOne1(map);
		
		request.setAttribute("user", user);

		//forward
		String forward_page = "id_find_phone.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(forward_page);
		disp.forward(request, response);
	}

}

