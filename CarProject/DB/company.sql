/*

--회사 정보
select * from company order by co_name asc
create table company(
	
	co_name			varchar2(100),		--회사이름
	co_loc			varchar2(100),		--소재지
	co_date			varchar2(100),		--창업일
	co_pres			varchar2(100),		--창립자
	co_motto		varchar2(100),		--슬로건
	co_business		varchar2(100),		--대표업종	
	co_intro		clob	,			--회사소개
	co_photo_s		varchar2(100),
	co_photo_l		varchar2(100)
	

)

drop table company

--pk
alter table company
	add constraint pk_company_name primary key(co_name);


 
 
 
 
 
 
 
 */