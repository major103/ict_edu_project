/*


--토론 게시판

	
	--일련번호
create sequence seq_chatting_c_index



create table chatting(
	
	c_index			int,
	c_title			varchar2(100),		--제목
	c_content		varchar2(1000),		--내용
	c_file			varchar2(100),
	c_date			date,				--작성일
	u_id			varchar2(100)--fk	--작성자
)


--pk
alter table chatting
	add constraint pk_chatting_c_index primary key(c_index);

--fk
 alter table chatting
 	add constraint fk_chatting_u_id foreign key(u_id)
 	references user_info(u_id);
 	
 	insert into chatting
 		values(seq_discuss_d_idx.nextVal,
 				'열받게하지마세요',
 				'당연히 있어야 하지 않을까요?',
 				null,
 				sysdate,
 				'admin')
 
select * from chatting
 
 --ip 컬럼 추가
 alter table chatting add c_ip varchar2(100)
 
 */