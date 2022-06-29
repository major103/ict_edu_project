/*


--토론 게시판

	
	--일련번호
create sequence seq_discuss_d_idx 

create table discuss(
	
	d_idx			int,
	d_title			varchar2(100),		--제목
	d_content		varchar2(1000),		--내용
	d_org_f			varchar2(1000),		--기존 첨부파일
	d_re_f			varchar2(1000),		--변경 첨부파일
	d_date			date,				--작성일
	d_mod_date		date,				--수정일
	d_count			int,				--조회수
	user_id			--fk				  작성자
)


--pk
alter table discuss
	add constraint pk_discuss_d_idx primary key(d_idx);

--fk
 alter table discuss
 	add constraint fk_discuss_user_id foreign key(user_id)
 	references user_info(user_id);
 

 
 
 */