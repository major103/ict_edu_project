package action.free;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import vo.UserVo;

/**
 * Servlet implementation class FreeInsertAction
 */
@WebServlet("/free/insert.do")
public class FreeInsertAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String web_path	= "/upload/";
		String path		= request.getServletContext().getRealPath(web_path);
		
		int max_size = 1024*1024*100;
		
		//MultipartRequest 이용
		MultipartRequest mr = new MultipartRequest(request, path, max_size, "utf-8", new DefaultFileRenamePolicy());
		
		//업로드된 파일 이름 얻어오기
		String free_org_f = "no_file";
		File f = mr.getFile("free_org_f");
		if(f!=null) {
			free_org_f = f.getName();
		}
		
		//로그인 정보 읽어오기
		UserVo user  = (UserVo) request.getSession().getAttribute("user");
		
		if(user==null) {
			
			response.sendRedirect("../user/login_form.do?reason=session_timeout");
			return;
		}
		
		int user_id = user.getU_idx();
		
		String free_title = mr.getParameter(free_org_f)	//아직 다 안함 내일 할게요

	}

}
