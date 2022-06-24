/*


--후기 및 평점

--일련번호 관리객체	
 	create sequence seq_grade_g_idx
 	
 	
create table grade(
	
	g_idx		int,			--게시글번호
	g_count 	int,			--조회수
	g_good		int,			--추천수
	g_content	varchar2(100),	--내용
	g_point		varchar2(100),  --평점
	user_id		varchar2(100)	--fk 작성자
)
 
 --pk
 alter table grade
 	add constraint pk_grade_g_idx primary key(g_idx);
 	
 --fk
 alter table grade
 	add constraint fk_grade_user_id	foreign key(user_id)
 	references user_info(user_id);
 
 
 
 
 
 */