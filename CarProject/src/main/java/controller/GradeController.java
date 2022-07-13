package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.GradeDao;
import vo.GradeVo;

@Controller
public class GradeController {

	GradeDao grade_dao;

	public void setGrade_dao(GradeDao grade_dao) {
		this.grade_dao = grade_dao;
	}
	
	
	@RequestMapping("/grade/list.do")
	public String list(Model model) {
		List<GradeVo> list = grade_dao.list();
		
		model.addAttribute(list);
		
		return "grade_list";
	}
}
