/*


--�亯


--�Ϸù�ȣ ������ü	
 	create sequence seq_reply_re_idx 

--table
create table reply(

	re_idx		int,				--�亯 ��ȣ
	re_writer	varchar2(100),		--�亯 �ۼ���
	re_date		date,				--�亯 �ۼ���
	re_content	clob,				--�亯 ����
	d_idx		--fk				  �Խñ� ��ȣ
	
)
 

--pk
alter table reply
	add constraint pk_reply_re_idx primary key(re_idx);
	
--fk
alter table reply
	add constraint fk_reply_d_idx foreign key(d_idx)
	references discuss(d_idx);
 
 
 
 
 */