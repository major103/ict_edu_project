package action.free;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao_0.FreeDao;
import vo.FreeVo;

/**
 * Servlet implementation class FreeModifyFormAction
 */
@WebServlet("/free/modify_form.do")
public class FreeModifyFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int free_idx = Integer.parseInt(request.getParameter("free_idx"));
		
		FreeVo vo = FreeDao.getInstance().selectOne(free_idx);
		
		String free_content = vo.getFree_content().replace("<br>", "\r\n");
		vo.setFree_content(free_content);
		
		request.setAttribute("vo", vo);
		
		//forward
		String forward_page = "free_modify_form.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(forward_page);
		disp.forward(request, response);
	}

}
