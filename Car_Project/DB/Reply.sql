/*


--답변


--일련번호 관리객체	
 	create sequence seq_reply_re_idx 

--table
create table reply(

	re_idx		int,				--답변 번호
	re_writer	varchar2(100),		--답변 작성자
	re_date		date,				--답변 작성일
	re_content	clob,				--답변 내용
	d_idx		--fk				  게시글 번호
	
)
 

--pk
alter table reply
	add constraint pk_reply_re_idx primary key(re_idx);
	
--fk
alter table reply
	add constraint fk_reply_d_idx foreign key(d_idx)
	references discuss(d_idx);
 
 
 
 
 */