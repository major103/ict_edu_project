package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserDao;
import vo.UserVo;

@Controller
@RequestMapping("/user/")
public class UserController {

	UserDao user_dao;

	
	public void setUser_dao(UserDao user_dao) {
		this.user_dao = user_dao;
	}

	//조회
	@RequestMapping("list.do")
	public String userList(Model model) {
		List<UserVo> list = user_dao.list();
		
		model.addAttribute("list", list);
		
		
		return "user/user_list";
	}
	
	//삽입
	@RequestMapping("insert_form.do")
	public String insertForm() {
		
		return "user_insert_form";
	
	}
	
	@RequestMapping("insert.do")
	public String insert(UserVo vo) {
		
		
		
		return "user_insert";
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
