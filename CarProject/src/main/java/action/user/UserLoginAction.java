package action.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import vo.UserVo;

/**
 * Servlet implementation class UserLoginAction
*/
@WebServlet("/user/login.do")
public class UserLoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//1.수신인코딩
		request.setCharacterEncoding("utf-8");
		
		//2.parameter받기
		String u_id = request.getParameter("u_id");
		String u_pwd = request.getParameter("u_pwd");

		//3.u_id에 해당되는 회원정보 가져오기
		UserVo user = UserDao.getInstance().selectOne(u_id);
		
		//u_id체크
		if(user==null) {
			//Session Tracking
			response.sendRedirect("login_form.do?reason=fail_id");
			return;
		}
		
		//u_pwd체크
		if(user.getU_pwd().equals(u_pwd)==false) {
			//Session Tracking
			response.sendRedirect("login_form.do?reason=fail_pwd&u_id=" + u_id);
			return;
		}
	
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		response.sendRedirect("../user/list.do");
	}

}

