package action.free;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FreeDao;
import vo.FreeVo;

/**
 * Servlet implementation class FreeModifyAction
 */
@WebServlet("/free_modify.do")
public class FreeModifyAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");
		
		int free_idx = Integer.parseInt(request.getParameter("free_idx"));
		String free_title = request.getParameter("free_title");
		String free_content = request.getParameter("free_content").replaceAll("\r\n", "<br>");
		
		String free_ip = request.getRemoteAddr();
		
		FreeVo vo = new FreeVo(free_idx, free_title, free_content, free_ip);
		
		int res = FreeDao.getInstance().update(vo);
		
		response.sendRedirect("list.do");
	}

}
