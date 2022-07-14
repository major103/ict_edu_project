package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.NewsDao;
import vo.NewsVo;

@Controller
public class NewsController {

	NewsDao news_dao;

	public void setNews_dao(NewsDao news_dao) {
		this.news_dao = news_dao;
	}
	
	
	@RequestMapping("/admin/news_insert_form.do")
	public String adminNewsInsertForm() {
		
		return "admin/news/news_insert_form";
	}

	
	@RequestMapping("/admin/news_insert.do")
	public String adminNewsInsert(NewsVo vo) throws Exception {
		
		news_dao.insert(vo);
		
		return "redirect:news_list.do";
	}
}
