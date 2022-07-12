/*

--탈퇴


create table withdraw(
	
	u_id		varchar2(100), --fk	회원 아이디
	u_name	varchar2(100),			--회원 이름
	u_gender	varchar2(100),		--성별
	u_birth	varchar2(100),			--생년월일
	u_phone	varchar2(100),			--전화번호
	u_email	varchar2(100),			--이메일
	last_date	date,				--마지막 접속일
	drop_date	date				--삭제 예정일

)
 

--fk
alter table withdraw
	add constraint fk_withdraw_user_id foreign key(user_id)
	references user_info(user_id)
 
 
 
 
 
 
 */