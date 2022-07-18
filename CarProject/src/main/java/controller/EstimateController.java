package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.EstimateDao;
import vo.EstimateVo;

@Controller
public class EstimateController {

	EstimateDao estimate_dao;

	public void setEstimate_dao(EstimateDao estimate_dao) {
		this.estimate_dao = estimate_dao;
	}
	
	@RequestMapping("/admin/estimate_insert_form.do")
	public String adminEstimateInsertForm(Model model) {
	
		return "admin/estimate/estimate_insert_form";
		
	}
	
	
	
	@RequestMapping("/admin/estimate_insert.do")
	public String adminEstimateInsert(EstimateVo vo) throws Exception {
		
		estimate_dao.insert(vo);
		
		return "redirect:estimate_list.do";
	}
}
