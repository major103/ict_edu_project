package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.CarDao;
import dao.ChattingDao;
import dao.CompanyDao;
import dao.EstimateDao;
import dao.FreeDao;
import dao.GradeDao;
import dao.NewsDao;
import dao.RecommendDao;
import dao.ReplyDao;
import dao.UserDao;
import dao.WithdrawDao;
import vo.CarVo;
import vo.ChattingVo;
import vo.CompanyVo;
import vo.EstimateVo;
import vo.FreeVo;
import vo.GradeVo;
import vo.NewsVo;
import vo.RecommendVo;
import vo.ReplyVo;
import vo.UserVo;
import vo.WithdrawVo;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	CarDao  	car_dao;
	ChattingDao chatting_dao;
	CompanyDao 	company_dao;
	EstimateDao	estimate_dao;
	FreeDao 	free_dao;
	GradeDao 	grade_dao;
	NewsDao 	news_dao;
	RecommendDao recommend_dao;
	ReplyDao 	reply_dao;
	UserDao 	user_dao;
	WithdrawDao	withdraw_dao;
	
	
	
	
	public AdminController(CarDao car_dao, ChattingDao chatting_dao, CompanyDao company_dao, EstimateDao estimate_dao,
			FreeDao free_dao, GradeDao grade_dao, NewsDao news_dao, RecommendDao recommend_dao, ReplyDao reply_dao,
			UserDao user_dao, WithdrawDao withdraw_dao) {
		super();
		this.car_dao = 		car_dao;
		this.chatting_dao = chatting_dao;
		this.company_dao = 	company_dao;
		this.estimate_dao = estimate_dao;
		this.free_dao = 	free_dao;
		this.grade_dao = 	grade_dao;
		this.news_dao = 	news_dao;
		this.recommend_dao = recommend_dao;
		this.reply_dao = 	reply_dao;
		this.user_dao = 	user_dao;
		this.withdraw_dao = withdraw_dao;
	}



	@RequestMapping("car_list.do")
	public String carList(Model model) {
		List<CarVo> list = car_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/car/car_list";
	}
	
	@RequestMapping("chatting_list.do")
	public String chattingList(Model model) {
		List<ChattingVo> list = chatting_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/chatting/chatting_list";
	}
	
	@RequestMapping("company_list.do")
	public String companyList(Model model) {
		List<CompanyVo> list = company_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/company/company_list";
	}
	
	@RequestMapping("estimate_list.do")
	public String estimateList(Model model) {
		List<EstimateVo> list = estimate_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/estimate/estimate_list";
	}
	
	@RequestMapping("free_list.do")
	public String freeList(Model model) {
		List<FreeVo> list = free_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/free/free_list";
	}



	@RequestMapping("grade_list.do")
	public String gradeList(Model model) {
		List<GradeVo> list = grade_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/grade/grade_list";
	}



	@RequestMapping("news_list.do")
	public String newsList(Model model) {
		List<NewsVo> list = news_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/news/news_list";
	}
	
	@RequestMapping("recommend_list.do")
	public String recommendList(Model model) {
		List<RecommendVo> list = recommend_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/recommend/recommend_list";
	}
	
	@RequestMapping("reply_list.do")
	public String replyList(Model model) {
		List<ReplyVo> list = reply_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/reply/reply_list";
	}



	@RequestMapping("user_list.do")
	public String userList(Model model) {
		
		List<UserVo> list = user_dao.list();
		model.addAttribute("list",list);
		return "admin/user/user_list";
	}
	
	
	@RequestMapping("withdraw_list.do")
	public String withdrawList(Model model) {
		List<WithdrawVo> list = withdraw_dao.list();
		
		model.addAttribute("list", list);
		
		return "admin/withdraw/withdraw_list";
	}
	
}
