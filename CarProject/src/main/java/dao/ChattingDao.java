package dao;

import java.util.List;

import vo.ChattingVo;

public interface ChattingDao {

	List<ChattingVo> selectList();

	int insert(ChattingVo vo) throws Exception;
	
	int update(ChattingVo vo) throws Exception;
	
	int delete(int idx) throws Exception;
	
}
