/*
 	--유저 일련번호
 	create sequence seq_user_u_idx
 	
 	--유저테이블
 	create table user_info (
 	u_idx		int,						
 	u_id		varchar2(100)		not null, --
 	u_pwd		varchar2(100)		not null,
 	u_gender	varchar2(100)		not null,
 	u_birth		varchar2(100)		not null,
 	u_phone		varchar2(100)		not null,
 	u_email 	varchar2(100)		not null,
 	u_ip		varchar2(100)		not null,
 	confirm_yn	varchar2(100)		default 'n',
 	joindate	date,
 	admin_yn	varchar2(100) 		default 'n',
 	last_log	date				
 	
 	)
 	
 	--기본키
 	alter table user_info
 		add constraint pk_user_u_idx primary key(u_idx);
 		
 	--아이디 unique
 	alter table user_info
 		add constraint unique_user_u_id unique(u_id);
 	
 	--관리자 여부
 	alter table user_info
 		add constraint ck_user_admin_yn check(admin_yn in ('y','n'));
 		
 	--sample data
 	insert into user_info
 		values(seq_user_u_idx.nextVal,
 				'admin',
 				'1234',
 				'남',
 				'1994/07/29',
 				'010-4057-2432',
 				'dusgod30@gmail.com',
 				'n',
 				sysdate,
 				'y',
 				sysdate);
 				
 				
 				
 	--조회
 	select * from user_info
 	
 	
 
 
 
 
 
 
 
 
 */