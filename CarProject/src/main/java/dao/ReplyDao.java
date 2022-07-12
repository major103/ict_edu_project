package dao;

import java.util.List;

import vo.ReplyVo;

public class ReplyDao {

	//single-ton : 객체 1개만 생성해서 사용하자
	static ReplyDao single = null;

	public static ReplyDao getInstance() {

		//객체가 없으면 생성해라
		if (single == null)
			single = new ReplyDao();

		return single;
	}

	//외부에서 생성하지 말것
	private ReplyDao() {
		// TODO Auto-generated constructor stub
	}

	public List<ReplyVo> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
}
