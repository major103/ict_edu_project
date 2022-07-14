package dao_0;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.UserVo;

public class UserDao {
	
	SqlSessionFactory factory;
	//single-ton : ��ü 1���� �����ؼ� �������!
	//����ƽ��ü�� ������ �ϳ��� ���������.
	static UserDao single = null;

	//����ƽ�� ������ ����ƽ���θ�
	public static UserDao getInstance() {

		//��ü�� ������ �����ض� ȣ��� �ѹ��� ��ü�� ����
		if (single == null)
			single = new UserDao();

		return single;
	}

	//�ܺο��� ��ü�� �������� ���ϰ� ����
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
