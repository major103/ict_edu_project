package dao_0;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.UserVo;

public class UserDao {
	
	SqlSessionFactory factory;
	//single-ton : 객체 1개만 생성해서 사용하자!
	//스태틱객체는 무조건 하나만 만들어진다.
	static UserDao single = null;

	//스태틱은 무조건 스태틱으로만
	public static UserDao getInstance() {

		//객체가 없으면 생성해라 호출된 한번만 객체를 생성
		if (single == null)
			single = new UserDao();

		return single;
	}

	//외부에서 객체를 생성하지 못하게 막음
	private UserDao() {
		// TODO Auto-generated constructor stub
		factory = MyBatisConnector.getInstance().getSqlSessionFactory();
	}
	
	public UserVo selectOne(String u_id) {
		
		UserVo vo = null;
		
		SqlSession sqlSession = factory.openSession();
		
		vo = sqlSession.selectOne("user.user_one_id", u_id);
		
		sqlSession.close();
		
		return vo;
	}

	public UserVo selectOne1(Map map) {
		// TODO Auto-generated method stub
		UserVo u_id = null;
		
		SqlSession sqlSession = factory.openSession();
		
		u_id = sqlSession.selectOne("user.user_one_phone", map);
		
		sqlSession.close();
		
		return u_id;
	}
	

}
