/*

--���


--�Ϸù�ȣ
create sequence seq_withdraw_com_idx

--���̺�
create table comment(

	com_idx			int,
	com_writer		varchar2(100)		not null,	--��� �ۼ���
	com_date		date,							--��� �ۼ���
	com_content		clob,							--��� ����
	free_idx		int						--fk	  �Խñ� ��ȣ
	
)
 
--pk
alter table comment
	add constraint pk_comment_idx primary key(com_idx);
 
--fk
alter table comment
	add constraint fk_comment_free_idx foreign key(free_idx)
	references free(free_index)
 
 
 
 */