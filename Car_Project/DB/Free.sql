/*

--�����Խ���

--�Ϸù�ȣ ������ü
	create sequence seq_free_free_idx
	
create table free(

	free_idx 		int,						--�Խñ� ��ȣ
	free_title		varchar2(100) not null,		--����
	free_content	varchar2(100),				--����
	free_org_f		varchar2(100),				--���� ÷������
	free_mod_f		varchar2(100),				--���� ÷������
	free_date		date,						--�ۼ���
	free_mod_date	date,						--������
	free_count		int,						--��ȸ��
	user_id			varchar2(100) --fk		      �ۼ���
	
)

--pk
alter table free
	add constraint pk_free_idx primary key(free_idx);

--fk
alter table free
	add constraint fk_free_user_id foreign key(user_id)
	references user_info(user_id);
 
 
 
 
 
 
 
 */