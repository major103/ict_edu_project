package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.WithdrawDao;
import vo.WithdrawVo;

@Controller
public class WithdrawController {

	WithdrawDao withdraw_dao;

	public void setWithdraw_dao(WithdrawDao withdraw_dao) {
		this.withdraw_dao = withdraw_dao;
	}
	
	
	@RequestMapping("/withdraw/list.do")
	public String list(Model model) {
		List<WithdrawVo> list = withdraw_dao.list();
		
		model.addAttribute(list);
		
		return "withdraw_list";
	}
}
