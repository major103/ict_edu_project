package dao;

import java.util.List;

import vo.CommentVo;

public class CommentDao {

	//single-ton : 객체 1개만 생성해서 사용하자
	static CommentDao single = null;

	public static CommentDao getInstance() {

		//객체가 없으면 생성해라
		if (single == null)
			single = new CommentDao();

		return single;
	}

	//외부에서 생성하지 말것
	private CommentDao() {
		// TODO Auto-generated constructor stub
	}

	public List<CommentVo> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
}
