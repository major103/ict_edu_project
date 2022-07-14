package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.GradeDao;
import vo.GradeVo;

@Controller
public class GradeController {

	GradeDao grade_dao;

	public void setGrade_dao(GradeDao grade_dao) {
		this.grade_dao = grade_dao;
	}
	
	
	@RequestMapping("/admin/grade_insert_form.do")
	public String adminGradeInsertForm() {
		
		return "admin/grade/grade_insert_form";
	}

	
	@RequestMapping("/admin/grade_insert.do")
	public String adminGradeInsert(GradeVo vo) throws Exception {
		
		grade_dao.insert(vo);
		
		return "redirect:grade_list.do";
	}
}
