/*

--탈퇴


create table withdraw(
	
	user_id		varchar2(100), --fk	회원 아이디
	user_name	varchar2(100),		--회원 이름
	user_gender	varchar2(100),		--성별
	user_birth	varchar2(100),		--생년월일
	user_phone	varchar2(100),		--전화번호
	user_email	varchar2(100),		--이메일
	last_date	date,				--마지막 접속일
	drop_date	date				--삭제 예정일

)
 

--fk
alter table withdraw
	add constraint fk_withdraw_user_id foreign key(user_id)
	references user_info(user_id)
 
 
 
 
 
 
 */