package dao;

import vo.UserVo;

public class UserDao {

	//single-ton : 객체 1개만 생성해서 사용하자
	static UserDao single = null;

	public static UserDao getInstance() {

		//객체가 없으면 생성해라
		if (single == null)
			single = new UserDao();

		return single;
	}

	//외부에서 생성하지 말것
	private UserDao() {
		// TODO Auto-generated constructor stub
	}

	public int insert(UserVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
