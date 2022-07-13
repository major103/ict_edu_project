package controller;

import java.util.List;

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
	
	@RequestMapping("/chatting/list.do")
	public String list(Model model) {
		List<ChattingVo> list = chatting_dao.list();
		
		model.addAttribute("list",list);
		
		return "chatting_list";
	}
	
	
}
