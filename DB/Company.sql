/*

--회사 정보

create table co_info(
	
	co_name		varchar2(100),			--회사이름
	co_loc			varchar2(100),		--소재지
	co_date		varchar2(100),			--창업일
	co_pres		varchar2(100),			--창립자
	co_motto		varchar2(100),		--슬로건
	co_business	varchar2(100),			--대표업종	
	co_intro		clob				--회사소개
	

)

--pk
alter table co_info
	add constraint pk_company_name primary key(co_name);

--unique
alter table co_info
	add constraint unique_company_name unique(co_name);

 
 
 
 
 
 
 
 */