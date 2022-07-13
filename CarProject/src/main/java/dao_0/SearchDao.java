package dao_0;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.SearchVo;

public class SearchDao {
	
	SqlSessionFactory factory;
	//single-ton : ��ü 1���� �����ؼ� �������!
	//����ƽ��ü�� ������ �ϳ��� ���������.
	static SearchDao single = null;

	//����ƽ�� ������ ����ƽ���θ�
	public static SearchDao getInstance() {

		//��ü�� ������ �����ض� ȣ��� �ѹ��� ��ü�� ����
		if (single == null)
			single = new SearchDao();

		return single;
	}

	//�ܺο��� ��ü�� �������� ���ϰ� ����
	private SearchDao() {
		// TODO Auto-generated constructor stub
		factory = MyBatisConnector.getInstance().getSqlSessionFactory();
	}

	public List<SearchVo> selectList(Map map) {
		// TODO Auto-generated method stub
		List<SearchVo> list = null;
		
		//1.SqlSession������
		SqlSession sqlSession = factory.openSession();
				
		//2.����
		list = sqlSession.selectList("search.search_list", map);
				
		//3.�ݱ�
		sqlSession.close();
		
		return list;
	}
}
