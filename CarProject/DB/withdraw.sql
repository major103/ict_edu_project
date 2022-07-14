/*

--탈퇴( fk삭제해야함 : )

select * from withdraw

create table withdraw(
	
	u_id		varchar2(100), --fk	회원 아이디
	u_name		varchar2(100),			--회원 이름
	u_gender	varchar2(100),		--성별
	u_birth		varchar2(100),			--생년월일
	u_phone		varchar2(100),			--전화번호
	u_email		varchar2(100),			--이메일
	last_date	date,				--마지막 접속일
	drop_date	date				--삭제 예정일

)

select * from withdraw


--pk?
alter table withdraw
	add constraint pk_withdraw_u_id primary key(u_id)
	
delete from withdraw fk_withdraw_u_id

--fk?
alter table withdraw
	add constraint fk_withdraw_u_id foreign key(u_id)
	references user_info(u_id)
	
delete from withdraw pk_withdraw_u_id
 
insert into withdraw
	values('kkb333',
			'김국병',
			'남',
			'1999-12-25',
			'010-2342-5252',
			'kkb111@gmail.com',
			sysdate,
			sysdate
			)
 
 
 select * from withdraw order by last_date asc
 */