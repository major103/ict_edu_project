package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import vo.FreeVo;

public class FreeDaoImpl implements FreeDao {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<FreeVo> selectList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("free.free_list");
	}

	@Override
	public FreeVo selectOne(int free_idx) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("free.free_one", free_idx);
	}

	@Override
	public int insert(FreeVo vo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("free.free_insert", vo);
	}

	@Override
	public int delete(int free_idx) {
		// TODO Auto-generated method stub
		return sqlSession.delete("free.free_delete", free_idx);
	}

	@Override
	public int update(FreeVo vo) {
		// TODO Auto-generated method stub
		return sqlSession.update("free.free_update", vo);
	}

}
