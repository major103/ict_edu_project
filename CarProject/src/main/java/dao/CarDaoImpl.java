package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.CarVo;

public class CarDaoImpl implements CarDao{

	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<CarVo> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(CarVo vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CarVo vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int idx) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
