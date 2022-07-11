/*


--후기 및 평점

--일련번호 관리객체	
 	create sequence seq_grade_g_index
 	
 select * from grade
 	
create table grade(
	
	g_index		int,			--게시글번호
	g_count 	int,			--조회수
	g_good		int,			--추천수
	g_content	varchar2(100),	--내용
	g_point		int,  --평점		--int로변경 (수치를 받아서 평균값을 계산하기 위함)
	u_id		varchar2(100)	--fk 작성자
)

drop table grade
 
 --pk
 alter table grade
 	add constraint pk_grade_g_idx primary key(g_idx);
 	
 --fk
 alter table grade
 	add constraint fk_grade_user_id	foreign key(u_id)
 	references user_info(u_id);
 
 insert into grade
 	values(seq_grade_g_idx.nextVal,
 			0,
 			0,
 			'내용없음',
 			3,
 			'admin')
 			
 
 
 
 */