package action.search;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao_0.SearchDao;
import vo.SearchVo;


/**
 * Servlet implementation class SearchListAction
*/
@WebServlet("/search/search_list.do")
public class SearchListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//1.�������ڵ�
		request.setCharacterEncoding("utf-8");
		
		String search_text = request.getParameter("search_text");
		
		Map map = new HashMap();
		map.put("${ param.search_text }", search_text);
		
		//��ϰ�������
		List<SearchVo> list = SearchDao.getInstance().selectList(map);

		//forward
		String forward_page = "search_list.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(forward_page);
		disp.forward(request, response);
	}

}

