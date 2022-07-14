package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.CarDao;
import dao.CompanyDao;
import vo.CarVo;
import vo.CompanyVo;

@Controller
public class CarController {

	CarDao car_dao;
	CompanyDao company_dao;
	
	
	

	public CarController(CarDao car_dao, CompanyDao company_dao) {
		super();
		this.car_dao = car_dao;
		this.company_dao = company_dao;
	}



	@RequestMapping("/admin/car_insert_form.do")
	public String adminCarInsertForm(Model model) {
		
		List<CompanyVo> list = company_dao.list();
		model.addAttribute("list",list);
		
		return "admin/car/car_insert_form";
	}
	
	
	
	@RequestMapping("/admin/car_insert.do")
	public String adminCarInsert(CarVo vo) throws Exception {
		
		car_dao.insert(vo);
		
		
		return "redirect:car_list.do";
	}
	
}
