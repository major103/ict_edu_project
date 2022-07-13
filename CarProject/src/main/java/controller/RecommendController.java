package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.RecommendDao;
import vo.RecommendVo;

@Controller
public class RecommendController {

	RecommendDao recommend_dao;

	public void setRecommend_dao(RecommendDao recommend_dao) {
		this.recommend_dao = recommend_dao;
	}
	
	
	@RequestMapping("/recommend/list.do")
	public String list(Model model) {
		List<RecommendVo> list = recommend_dao.list();
		
		model.addAttribute(list);
		
		return "recommend_list";
	}
}
