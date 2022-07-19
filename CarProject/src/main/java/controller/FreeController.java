package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.FreeDao;
import vo.FreeVo;

@Controller
@RequestMapping("/free/")
public class FreeController {

	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpSession session;
	
	FreeDao free_dao;

	public void setFree_dao(FreeDao free_dao) {
		this.free_dao = free_dao;
	}
	
	@RequestMapping("insert_form.do")
	public String insert_form() {
		
		return "free/free_insert_form";
	}
	
	@RequestMapping("insert.do")
	public String insert(FreeVo vo) {
		
		return "";
	}
	
	@RequestMapping("delete.do")
	public String delete(int free_idx) {
		
		return "";
	}
	
	@RequestMapping("modify_form.do")
	public String modify_form(int free_idx) {
		
		return "";
	}
	
	@RequestMapping("modify.do")
	public String modify(FreeVo vo) {
		
		return "";
	}
	
}
