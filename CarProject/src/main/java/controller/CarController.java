package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.CarDao;
import vo.CarVo;

@Controller
public class CarController {

	CarDao car_dao;


	
	public void setCar_dao(CarDao car_dao) {
		this.car_dao = car_dao;
	}



	@RequestMapping("/admin/car_list.do")
	public String CarList(Model model) {
		List<CarVo> list = car_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/car_list";
	}
	
}
