package action.free;

import java.io.File;
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
 * Servlet implementation class FreeDeleteAction
 */
@WebServlet("/free/delete.do")
public class FreeDeleteAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int free_idx = Integer.parseInt(request.getParameter("free_idx"));
		
		FreeVo vo = FreeDao.getInstance().selectOne(free_idx);
		
		String path = request.getServletContext().getRealPath("/upload/");
		
		File f = new File(path, vo.getFree_org_f());
		f.delete();
		
		int res = FreeDao.getInstance().delete(free_idx);
		
		response.sendRedirect("list.do");
	}

}
