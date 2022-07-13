package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ReplyDao;
import vo.ReplyVo;

@Controller
public class ReplyController {

	ReplyDao reply_dao;

	public void setReply_dao(ReplyDao reply_dao) {
		this.reply_dao = reply_dao;
	}
	
	
	@RequestMapping("/reply/list.do")
	public String list(Model model) {
		List<ReplyVo> list = reply_dao.list();
		
		model.addAttribute(list);
		
		return "Reply_list";
	}
}
