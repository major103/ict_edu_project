package dao_0;

import java.util.List;

import vo.ReplyVo;

public class ReplyDao {

	//single-ton : ��ü 1���� �����ؼ� �������
	static ReplyDao single = null;

	public static ReplyDao getInstance() {

		//��ü�� ������ �����ض�
		if (single == null)
			single = new ReplyDao();

		return single;
	}

	//�ܺο��� �������� ����
	private ReplyDao() {
		// TODO Auto-generated constructor stub
	}

	public List<ReplyVo> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
}
