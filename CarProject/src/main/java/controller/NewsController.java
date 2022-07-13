package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.NewsDao;
import vo.NewsVo;

@Controller
public class NewsController {

	NewsDao news_dao;

	public void setNews_dao(NewsDao news_dao) {
		this.news_dao = news_dao;
	}
	
	
	@RequestMapping("/news/list.do")
	public String list(Model model) {
		List<NewsVo> list = news_dao.list();
		
		model.addAttribute(list);
		
		return "news_list";
	}
}
