package action.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao_0.UserDao;
import vo.UserVo;

/**
 * Servlet implementation class UserInsertAction
 */
@WebServlet("/user/insert.do")
public class UserInsertAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		String u_name    = request.getParameter("u_name");
		String u_id      = request.getParameter("u_id");
		String u_pwd     = request.getParameter("u_pwd");
		String u_gender	 = request.getParameter("u_gender");
		String u_birth	 = request.getParameter("u_birth");
		String u_phone	 = request.getParameter("u_phone");
		String u_email	 = request.getParameter("u_email");
		
		String u_ip      = request.getRemoteAddr();
		
		UserVo vo = new UserVo(u_name, u_id, u_pwd, u_gender, u_birth, u_phone, u_email, u_ip);
		
		int res = UserDao.getInstance().insert(vo);
		
		response.sendRedirect("");
	}

}
