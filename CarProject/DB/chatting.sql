/*


--토론 게시판

	
	--일련번호
create sequence seq_chatting_c_index



create table chatting(
	
	c_index			int,
	c_title			varchar2(100),		--제목
	c_content		varchar2(255),		--내용
	c_file
	c_date			date,				--작성일
	u_id			varchar2(100)--fk	--작성자
)


--pk
alter table chatting
	add constraint pk_discuss_d_idx primary key(d_idx);

--fk
 alter table chatting
 	add constraint fk_discuss_user_id foreign key(u_id)
 	references user_info(u_id);
 	
 	insert into chatting
 		values(seq_discuss_d_idx.nextVal,
 				'열받게하지마세요',
 				'당연히 있어야 하지 않을까요?',
 				null,
 				sysdate,
 				'admin')
 
select * from discuss
 
 
 */