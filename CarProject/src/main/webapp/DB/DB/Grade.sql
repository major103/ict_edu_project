/*


--�ı� �� ����

--�Ϸù�ȣ ������ü	
 	create sequence seq_grade_g_idx
 	
 	
create table grade(
	
	g_idx		int,			--�Խñ۹�ȣ
	g_count 	int,			--��ȸ��
	g_good		int,			--��õ��
	g_content	varchar2(100),	--����
	g_point		varchar2(100),  --����
	user_id		varchar2(100)	--fk �ۼ���
)
 
 --pk
 alter table grade
 	add constraint pk_grade_g_idx primary key(g_idx);
 	
 --fk
 alter table grade
 	add constraint fk_grade_user_id	foreign key(user_id)
 	references user_info(user_id);
 
 
 
 
 
 */