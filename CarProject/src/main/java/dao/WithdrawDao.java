package dao;

import java.util.List;

import vo.WithdrawVo;

public interface WithdrawDao {

	List<WithdrawVo> selectList();

	int insert(WithdrawVo vo) throws Exception;
	
	int update(WithdrawVo vo) throws Exception;
	
	int delete(int idx) throws Exception;
}
