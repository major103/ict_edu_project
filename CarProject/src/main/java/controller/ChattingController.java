package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ChattingDao;
import vo.ChattingVo;

@Controller
public class ChattingController {

	ChattingDao chatting_dao;

	public void setChatting_dao(ChattingDao chatting_dao) {
		this.chatting_dao = chatting_dao;
	}
	
	@RequestMapping("/admin/chatting_insert_form.do")
	public String adminCattingInsertForm(Model model) {
		
		return "admin/chatting/chatting_insert_form";
	}

	
	@RequestMapping("/admin/chatting_insert.do")
	public String adminChattingInsert(ChattingVo vo) throws Exception {
		
		chatting_dao.insert(vo);
		
		return "redirect:chatting_list.do";
	}
	
	
}
