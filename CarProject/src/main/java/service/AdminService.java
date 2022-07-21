package service;

import java.util.Map;

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

public interface AdminService {

		//select
	Map car_List();
	Map chatting_List();
	Map company_List();
	Map estimate_List();
	Map free_List();
	Map grade_List();
	Map news_List();
	Map recommend_List();
	Map reply_List();
	Map user_List();
	Map withdraw_List();
	
		//insert
	int car_insert(CarVo vo);
	int chatting_insert(ChattingVo vo);
	int company_insert(CompanyVo vo);
	int estimate_insert(EstimateVo vo);
	int free_insert(FreeVo vo);
	int grade_insert(GradeVo vo);
	int news_insert(NewsVo vo);
	int recommend_insert(RecommendVo vo);
	int reply_insert(ReplyVo vo);
	int user_insert(UserVo vo);
	int withdraw_insert(WithdrawVo vo);
	
		//update
	int car_update(CarVo vo);
	int chatting_update(ChattingVo vo);
	int company_update(CompanyVo vo);
	int estimate_update(EstimateVo vo);
	int free_update(FreeVo vo);
	int grade_update(GradeVo vo);
	int news_update(NewsVo vo);
	int recommend_update(RecommendVo vo);
	int reply_update(ReplyVo vo);
	int user_update(UserVo vo);
	int withdraw_update(WithdrawVo vo);
	
		//delete
	int car_delete(CarVo vo);
	int chatting_delete(ChattingVo vo);
	int company_delete(CompanyVo vo);
	int estimate_delete(EstimateVo vo);
	int free_delete(FreeVo vo);
	int grade_delete(GradeVo vo);
	int news_delete(NewsVo vo);
	int recommend_delete(RecommendVo vo);
	int reply_delete(ReplyVo vo);
	int user_delete(UserVo vo);
	int withdraw_delete(WithdrawVo vo);
	
		//selectOne
	CarVo car_selectOne(int car_index);
}
