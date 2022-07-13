package controller;

import java.util.List;

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
	
	@RequestMapping("/estimate/list.do")
	public String list(Model model) {
		List<EstimateVo> list = estimate_dao.list();
		
		model.addAttribute(list);
		
		return "estimate_list";
	}
}
