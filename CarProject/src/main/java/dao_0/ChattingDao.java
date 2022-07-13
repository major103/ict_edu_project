package dao_0;

import java.util.List;

import vo.ChattingVo;

public class ChattingDao {

	//single-ton : ��ü 1���� �����ؼ� �������
	static ChattingDao single = null;

	public static ChattingDao getInstance() {

		//��ü�� ������ �����ض�
		if (single == null)
			single = new ChattingDao();

		return single;
	}

	//�ܺο��� �������� ����
	private ChattingDao() {
		// TODO Auto-generated constructor stub
	}

	public List<ChattingVo> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
}
