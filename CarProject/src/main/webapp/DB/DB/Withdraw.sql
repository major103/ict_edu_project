/*

--Ż��


create table withdraw(
	
	user_id		varchar2(100), --fk	ȸ�� ���̵�
	user_name	varchar2(100),		--ȸ�� �̸�
	user_gender	varchar2(100),		--����
	user_birth	varchar2(100),		--�������
	user_phone	varchar2(100),		--��ȭ��ȣ
	user_email	varchar2(100),		--�̸���
	last_date	date,				--������ ������
	drop_date	date				--���� ������

)
 

--fk
alter table withdraw
	add constraint fk_withdraw_user_id foreign key(user_id)
	references user_info(user_id)
 
 
 
 
 
 
 */