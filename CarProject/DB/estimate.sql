/*


--견적

select * from estimate

create table estimate(
	
	car_name		varchar2(100),		--fk	--차량 이름
	e_option			varchar2(100),			--옵션
	e_price			int							--가격

)
 

--fk
alter table estimate
	add constraint fk_estim_car_name foreign key(car_name)
	references car_info(car_name)

 
 
 
 
 
 */