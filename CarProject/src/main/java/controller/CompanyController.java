package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.CompanyDao;
import vo.CompanyVo;

@Controller
public class CompanyController {

	CompanyDao company_dao;
	
	public void setCompany_dao(CompanyDao company_dao) {
		this.company_dao = company_dao;
	}

	@RequestMapping("/admin/company_insert_form.do")
	public String adminCompanyInsertForm() {
		
		return "admin/company/company_insert_form";
	}

	
	@RequestMapping("/admin/company_insert.do")
	public String adminCompanyInsert(CompanyVo vo) throws Exception {
		
		company_dao.insert(vo);
		
		return "redirect:company_list.do";
	}
	
}
