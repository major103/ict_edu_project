package dao_0;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.FreeVo;

public class FreeDao {
	
	//single-ton : ��ü 1���� �����ؼ� �������
	static FreeDao single = null;

	SqlSessionFactory factory;
	
	public static FreeDao getInstance() {

		//��ü�� ������ �����ض�
		if (single == null)
			single = new FreeDao();

		return single;
	}

	//�ܺο��� �������� ����
	private FreeDao() {
		// TODO Auto-generated constructor stub
		factory = MyBatisConnector.getInstance().getSqlSessionFactory();
	}
	
	public List<FreeVo> selectList() {

		List<FreeVo> list = new ArrayList<FreeVo>();

		SqlSession sqlSession = factory.openSession();
		
		list = sqlSession.selectList("free.free_list");

		sqlSession.close();

		return list;
	}

	public FreeVo selectOne(int free_idx) {
		// TODO Auto-generated method stub
		FreeVo vo = null;
		
		SqlSession sqlSession = factory.openSession();
		
		vo = sqlSession.selectOne("free.free_one", free_idx);
		
		sqlSession.close();
		
		return vo;
	}

	public int delete(int free_idx) {
		// TODO Auto-generated method stub
		int res = 0;
		
		SqlSession sqlSession = factory.openSession(true);
		
		res = sqlSession.delete("free.free_delete", free_idx);
		
		sqlSession.close();
		
		return res;
	}

	public int update(FreeVo vo) {
		// TODO Auto-generated method stub
		int res = 0;
		
		SqlSession sqlSession = factory.openSession(true);
		
		res = sqlSession.update("free.free_update", vo);
		
		sqlSession.close();
		
		return res;
	}

	public int insert(FreeVo vo) {
		// TODO Auto-generated method stub
		int res = 0;
		
		SqlSession sqlSession = factory.openSession(true);
		
		res = sqlSession.insert("free.free_insert", vo);
		
		sqlSession.close();
		
		return res;
	}

}
