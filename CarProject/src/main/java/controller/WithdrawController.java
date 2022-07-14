package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.WithdrawDao;
import vo.WithdrawVo;

@Controller
public class WithdrawController {

	WithdrawDao withdraw_dao;

	public void setWithdraw_dao(WithdrawDao withdraw_dao) {
		this.withdraw_dao = withdraw_dao;
	}
	
	
	@RequestMapping("/admin/withdraw_insert_form.do")
	public String adminWithdrawInsertForm() {
		
		return "grade/withdraw/withdraw_insert_form";
	}

	
	@RequestMapping("/admin/withdraw_insert.do")
	public String adminWithdrawInsert(WithdrawVo vo) throws Exception {
		
		withdraw_dao.insert(vo);
		
		return "redirect:withdraw_list.do";
	}
	
}
