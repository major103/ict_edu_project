package dao_0;

import vo.UserVo;

public class UserDao {

	//single-ton : ��ü 1���� �����ؼ� �������
	static UserDao single = null;

	public static UserDao getInstance() {

		//��ü�� ������ �����ض�
		if (single == null)
			single = new UserDao();

		return single;
	}

	//�ܺο��� �������� ����
	private UserDao() {
		// TODO Auto-generated constructor stub
	}

	public int insert(UserVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
