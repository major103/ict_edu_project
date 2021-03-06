package dao;

import java.util.List;

import vo.ReplyVo;

public interface ReplyDao {

	List<ReplyVo> selectList();

	int insert(ReplyVo vo) throws Exception;
	
	int update(ReplyVo vo) throws Exception;
	
	int delete(int idx) throws Exception;
	
}
