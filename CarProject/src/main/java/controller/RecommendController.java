package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.RecommendDao;
import vo.RecommendVo;

@Controller
public class RecommendController {

	RecommendDao recommend_dao;

	public void setRecommend_dao(RecommendDao recommend_dao) {
		this.recommend_dao = recommend_dao;
	}
	
	
	@RequestMapping("/admin/recommend_insert_form.do")
	public String adminRecommendInsertForm() {
		
		return "admin/recommend/recommend_insert_form";
	}

	
	@RequestMapping("/recommend/recommend_insert.do")
	public String adminRecommendInsert(RecommendVo vo) throws Exception {
		
		recommend_dao.insert(vo);
		
		return "redirect:recommend_list.do";
	}
}
