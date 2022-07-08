/*

--뉴스

select * from news

--일련번호 관리객체	
create sequence seq_news_n_idx
	
--table
create table news(

	n_idx		int,				--글 번호
	n_writer	varchar2(100),		--작성자
	n_title		varchar2(100),		--뉴스 제목
	n_content	clob,				--뉴스 내용
	n_link		varchar2(100),		--작성일자
	n_date		date,				--조회수
	n_count		int					--링크
	
)

--pk
alter table news
	add constraint pk_news_n_idx primary key(n_idx);
	

 
 
 
 
 
 
 
 */