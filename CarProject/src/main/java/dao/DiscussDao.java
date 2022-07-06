package dao;

public class DiscussDao {

	//single-ton : 객체 1개만 생성해서 사용하자
	static DiscussDao single = null;

	public static DiscussDao getInstance() {

		//객체가 없으면 생성해라
		if (single == null)
			single = new DiscussDao();

		return single;
	}

	//외부에서 생성하지 말것
	private DiscussDao() {
		// TODO Auto-generated constructor stub
	}
}
