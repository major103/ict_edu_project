package dao;

public class GradeDao {

	//single-ton : 객체 1개만 생성해서 사용하자
	static GradeDao single = null;

	public static GradeDao getInstance() {

		//객체가 없으면 생성해라
		if (single == null)
			single = new GradeDao();

		return single;
	}

	//외부에서 생성하지 말것
	private GradeDao() {
		// TODO Auto-generated constructor stub
	}
}
