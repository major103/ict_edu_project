/*


--����

create table estimate(
	
	car_name		varchar2(100),		--fk	--���� �̸�
	option			varchar2(100),				--�ɼ�
	price			int							--����

)
 

--fk
alter table estimate
	add constraint fk_estim_car_name foreign key(car_name)
	references car_info(car_name)

 
 
 
 
 
 */