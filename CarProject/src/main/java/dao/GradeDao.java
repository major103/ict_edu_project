package dao;

import java.util.List;

import vo.GradeVo;

public interface GradeDao {

	List<GradeVo>	selectList();
	GradeVo			selectOne(int g_idx);
	
	int 			insert(GradeVo vo);
	int				delete(int g_idx);
	int				update(GradeVo vo);
}
