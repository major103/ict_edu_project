package dao;

public class DiscussDao {

	//single-ton : ��ü 1���� �����ؼ� �������
	static DiscussDao single = null;

	public static DiscussDao getInstance() {

		//��ü�� ������ �����ض�
		if (single == null)
			single = new DiscussDao();

		return single;
	}

	//�ܺο��� �������� ����
	private DiscussDao() {
		// TODO Auto-generated constructor stub
	}
}
