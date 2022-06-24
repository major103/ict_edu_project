/*
--�ڵ��� ����


--�Ϸù�ȣ
create sequence seq_car_car_idx


--���̺�

create table car_info(
	car_idx			int,
	car_name		varchar2(255)	not null,	--�����̸�
	car_size		varchar2(255),				--����ũ��
	car_brand		varchar2(255),				--�����귣��
	car_price		varchar2(255),				--��������
	car_fuel		varchar2(255),				--��������
	car_type		varchar2(255),				--��������
	car_f_cost		int,						--��������
	car_output		varchar2(255),				--�������
	car_torq		varchar2(255),				--������ũ
	car_exhaust		varchar2(255),				--�������
	car_engine		varchar2(255),				--��������
	car_drive		varchar2(255),				--��������
	car_change		varchar2(255),				--��������
	car_photo		varchar2(255)				--��������

)

--pk
alter table car_info
	add constraint pk_car_info_idx primary key(car_idx);
	
--���� unique
alter table car_info
	add constraint unique_car_info_name unique(car_name);
	

 
 
 
 
 
 
 
 */