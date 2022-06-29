/*

--댓글


--일련번호
create sequence seq_withdraw_com_idx

--테이블
create table comment(

	com_idx			int,
	com_writer		varchar2(100)		not null,	--댓글 작성자
	com_date		date,							--댓글 작성일
	com_content		clob,							--댓글 내용
	free_idx		int						--fk	  게시글 번호
	
)
 
--pk
alter table comment
	add constraint pk_comment_idx primary key(com_idx);
 
--fk
alter table comment
	add constraint fk_comment_free_idx foreign key(free_idx)
	references free(free_index)
 
 
 
 */