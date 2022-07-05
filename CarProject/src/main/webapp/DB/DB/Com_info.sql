/*

--회사 정보
drop table co_info

create table co_info(
	
	co_name			varchar2(100),			--회사이름
	co_loc			varchar2(100),			--소재지
	co_date			varchar2(100),			--창업일
	co_pres			varchar2(100),			--창립자
	co_motto		varchar2(100),			--슬로건
	co_business		varchar2(100),			--대표업종	
	co_intro		clob,					--회사소개
	co_photo_s		varchar2(255),			--사진 s
	co_photo_l		varchar2(255)			--사진 ㅣ
)

--pk
alter table co_info
	add constraint pk_company_name primary key(co_name);

--unique
alter table co_info
	add constraint unique_company_name unique(co_name);

 insert into co_info values('현대', '서울시 서초구 헌릉로 12', '1967 12 29', '정주영', 'New Thinking New Possibilities',
 							'자동차 제조업', '현대자동차는 자동차제조업에 대한 삼원화 정부 방침에 따라 고 정주영 회장이 1967년 12월 29일 설립한 회사로 처음에는 포드와 기술 제휴를 통하여 제조/조립 기술력을 향상시켰고, 1976년 국내 최초의 독자 모델인 ‘포니’를 생산하였으며, 경미한 수준의 수출도 이루어졌다. 1986년 수출전략형 모델인 ‘엑셀’이 출시되며 수출이 본격화되기 시작하였다.
							이후 쏘나타, 그랜저를 생산하며 국내 최대의 자동차 기업으로 성장하였고 2014년 세계 100대 브랜드 중 40위를 기록 하고 있다. 최초 고유 모델인 포니부터 최근 출시한 LF쏘나타까지 약 60여개 모델을 출시하며 성장하였고, 1998년 자회사로 편입한 기아자동차의 판매량을 포함하여 2014년에 771만대(현대차 : 497만대)를 판매, 누적으로 약 8,000만대를 판매한 세계적인 메이커가 되었다.
							2000년 8월 현대자동차그룹으로 계열분리 이후 본사를 서울시 양재동으로 이전하였으며, 국내 공장은 울산, 아산, 전주에 소재하고 있다. 또한, 전세계 완성차 공장은 중국, 미국, 유럽, 러시아, 브라질 등 전세계 대륙에 고루 분포하고 있다. 현대자동차의 심볼은 단순히 H를 형상화 한 것만이 아니라 두 사람이 악수하고 있는 모습을 담고 있다고 한다. H를 감싸고 있는 타원은 세계를 무대로 뛰고 있음을 뜻한다.',
							 '현대.png', '현대L.png');

 select * from co_info
 
 
 
 
 
 
 */