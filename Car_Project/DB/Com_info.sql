/*

--ȸ�� ����

create table co_info(
	
	co_name		varchar2(100),			--ȸ���̸�
	co_loc			varchar2(100),		--������
	co_date		varchar2(100),			--â����
	co_pres		varchar2(100),			--â����
	co_motto		varchar2(100),		--���ΰ�
	co_business	varchar2(100),			--��ǥ����	
	co_intro		clob				--ȸ��Ұ�
	

)

--pk
alter table co_info
	add constraint pk_company_name primary key(co_name);

--unique
alter table co_info
	add constraint unique_company_name unique(co_name);

 
 
 
 
 
 
 
 */