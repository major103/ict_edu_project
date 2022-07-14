package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ReplyDao;
import vo.ReplyVo;

@Controller
public class ReplyController {

	ReplyDao reply_dao;

	public void setReply_dao(ReplyDao reply_dao) {
		this.reply_dao = reply_dao;
	}
	
	
	@RequestMapping("/admin/reply_insert_form.do")
	public String adminReplyInsertForm() {
		
		return "admin/reply/reply_insert_form";
	}

	
	@RequestMapping("/admin/reply_insert.do")
	public String adminReplyInsert(ReplyVo vo) throws Exception {
		
		reply_dao.insert(vo);
		
		return "redirect:reply_list.do";
	}
}
