/*

--����õ


create table recommend(
	
	car_name		varchar2(100), --fk	���� �̸�
	rec_gender		varchar2(100),	  --����
	rec_age			int,			  --����
	user_id			varchar2(100), --fk ȸ�� ���̵�
	
)
 	
 	
 	
 	
--fk

alter table recommend
	add constraint fk_recommend_car_name foreign key(car_name)
	references car_info(car_name);
 
alter table recommend
	add constraint fk_recommend_user_id foreign key(user_id)
	references user_info(user_id);
 
 
 
 
 */