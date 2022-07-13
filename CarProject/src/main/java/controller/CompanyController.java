package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.CompanyDao;
import vo.CompanyVo;

@Controller
public class CompanyController {

	CompanyDao company_dao;
	
	public void setCompany_dao(CompanyDao company_dao) {
		this.company_dao = company_dao;
	}

	@RequestMapping("/company/list.do")
	public String list(Model model) {
		List<CompanyVo> list = company_dao.list();
		
		model.addAttribute(list);
		
		return "company_list";
	}
}
