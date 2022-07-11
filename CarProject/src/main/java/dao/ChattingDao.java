package dao;

import java.util.List;

import vo.ChattingVo;

public class ChattingDao {

	//single-ton : 객체 1개만 생성해서 사용하자
	static ChattingDao single = null;

	public static ChattingDao getInstance() {

		//객체가 없으면 생성해라
		if (single == null)
			single = new ChattingDao();

		return single;
	}

	//외부에서 생성하지 말것
	private ChattingDao() {
		// TODO Auto-generated constructor stub
	}

	public List<ChattingVo> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
}
