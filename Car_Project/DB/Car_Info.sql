/*
--자동차 정보


--일련번호
create sequence seq_car_car_idx


--테이블

create table car_info(
	car_idx			int,
	car_name		varchar2(255)	not null,	--차량이름
	car_size		varchar2(255),				--차량크기
	car_brand		varchar2(255),				--차량브랜드
	car_price		varchar2(255),				--차량가격
	car_fuel		varchar2(255),				--차량연료
	car_type		varchar2(255),				--차량종류
	car_f_cost		int,						--차량연비
	car_output		varchar2(255),				--차량출력
	car_torq		varchar2(255),				--차량토크
	car_exhaust		varchar2(255),				--차량배기
	car_engine		varchar2(255),				--차량엔진
	car_drive		varchar2(255),				--차량구동
	car_change		varchar2(255),				--차량변속
	car_photo		varchar2(255)				--차량사진

)

--pk
alter table car_info
	add constraint pk_car_info_idx primary key(car_idx);
	
--차종 unique
alter table car_info
	add constraint unique_car_info_name unique(car_name);
	

 
 
 
 
 
 
 
 */