/*

--모델추천


create table recommend(
	
	car_name		varchar2(100), --fk	차량 이름
	gender		varchar2(100),	  --성별
	age			int,			  --나이
	u_id			varchar2(100) --fk 회원 아이디
	
)
 	
 	
 	
 	
 	
--fk

alter table recommend
	add constraint fk_recommend_car_name foreign key(car_name)
	references car_info(car_name);
 
alter table recommend
	add constraint fk_recommend_user_id foreign key(u_id)
	references user_info(u_id);
 
 
 
 
 */