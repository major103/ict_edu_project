package dao;

public class GradeDao {

	//single-ton : ��ü 1���� �����ؼ� �������
	static GradeDao single = null;

	public static GradeDao getInstance() {

		//��ü�� ������ �����ض�
		if (single == null)
			single = new GradeDao();

		return single;
	}

	//�ܺο��� �������� ����
	private GradeDao() {
		// TODO Auto-generated constructor stub
	}
}
