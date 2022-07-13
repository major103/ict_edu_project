package dao_0;

import java.util.List;

import vo.CommentVo;

public class CommentDao {

	//single-ton : ��ü 1���� �����ؼ� �������
	static CommentDao single = null;

	public static CommentDao getInstance() {

		//��ü�� ������ �����ض�
		if (single == null)
			single = new CommentDao();

		return single;
	}

	//�ܺο��� �������� ����
	private CommentDao() {
		// TODO Auto-generated constructor stub
	}

	public List<CommentVo> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
}
