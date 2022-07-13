package controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		@RequestMapping("/free/list.do")
		public String list(Model model) {
			List<FreeVo> list = free_dao.list();
			
			model.addAttribute("list",list);
			
			return "free_list";
		}
		
		@RequestMapping("/free/insert_form.do")
		public String insertForm() {
			
			return "free_insert_form";
		}
		
		@RequestMapping("/free/insert.do")
		public String insert(FreeVo vo) {
			
		
			
			return "redirect:free_list.do";
		}
		
		
}
