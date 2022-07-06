package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.SearchVo;

public class SearchDao {
	
	SqlSessionFactory factory;
	//single-ton : 객체 1개만 생성해서 사용하자!
	//스태틱객체는 무조건 하나만 만들어진다.
	static SearchDao single = null;

	//스태틱은 무조건 스태틱으로만
	public static SearchDao getInstance() {

		//객체가 없으면 생성해라 호출된 한번만 객체를 생성
		if (single == null)
			single = new SearchDao();

		return single;
	}

	//외부에서 객체를 생성하지 못하게 막음
	private SearchDao() {
		// TODO Auto-generated constructor stub
		factory = MyBatisConnector.getInstance().getSqlSessionFactory();
	}

	public List<SearchVo> selectList(Map map) {
		// TODO Auto-generated method stub
		List<SearchVo> list = null;
		
		//1.SqlSession얻어오기
		SqlSession sqlSession = factory.openSession();
				
		//2.실행
		list = sqlSession.selectList("search.search_list", map);
				
		//3.닫기
		sqlSession.close();
		
		return list;
	}
}
