/*


--��� �Խ���

	
	--�Ϸù�ȣ
create sequence seq_discuss_d_idx 

create table discuss(
	
	d_idx			int,
	d_title			varchar2(100),		--����
	d_content		varchar2(1000),		--����
	d_org_f			varchar2(1000),		--���� ÷������
	d_re_f			varchar2(1000),		--���� ÷������
	d_date			date,				--�ۼ���
	d_mod_date		date,				--������
	d_count			int,				--��ȸ��
	user_id			--fk				  �ۼ���
)


--pk
alter table discuss
	add constraint pk_discuss_d_idx primary key(d_idx);

--fk
 alter table discuss
 	add constraint fk_discuss_user_id foreign key(user_id)
 	references user_info(user_id);
 

 
 
 */