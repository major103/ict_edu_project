package dao;

import java.util.List;
import java.util.Map;

import vo.FreeVo;

public interface FreeDao {
	
	List<FreeVo>	selectList();
	FreeVo			selectOne(int free_idx);
	
	int				insert(FreeVo vo);
	int				delete(int free_idx);
	int				update(FreeVo vo);
}
