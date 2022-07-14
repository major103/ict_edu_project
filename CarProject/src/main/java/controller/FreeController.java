package controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.FreeDao;
import vo.FreeVo;

@Controller
public class FreeController {

	FreeDao free_dao;
	public void setFree_dao(FreeDao free_dao) {
		this.free_dao = free_dao;
	}
	
	@Autowired
	HttpServletRequest request;
	@Autowired
	ServletContext application;
	@Autowired
	HttpSession session;
		
	@RequestMapping("/admin/free_insert_form.do")
	public String adminFreeInsertForm() {
		
		return "admin/free/free_insert_form";
	}

	
	@RequestMapping("/admin/free_insert.do")
	public String adminFreeInsert(FreeVo vo) throws Exception {
		
		free_dao.insert(vo);
		
		return "redirect:free_list.do";
	}
		
}
