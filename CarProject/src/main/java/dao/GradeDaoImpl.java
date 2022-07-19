package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.GradeVo;

public class GradeDaoImpl implements GradeDao {

	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<GradeVo> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GradeVo selectOne(int g_idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(GradeVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int g_idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(GradeVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
