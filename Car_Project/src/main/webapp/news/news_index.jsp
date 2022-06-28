<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.jsoup.Jsoup" %>
<%@ page import="org.jsoup.nodes.Document" %>
<%@ page import="org.jsoup.nodes.Element" %>
<%@ page import="org.jsoup.select.Elements" %>

<%
	
    Document doc = Jsoup.connect("https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid1=103&sid2=239").get();
    // 파싱할 사이트를 적어, 모든 태그를 가져온다.


    Elements posts = doc.body().getElementsByClass("sc cs_language_test _sc_language_test");
                // sc cs_language_test _sc_language_test속성의 모든 태그를 가져온다.      


    int i=0;
    for(Element e : posts.select("dt:not(.align_center)")){
    //구성할 테이블 td 속성 요소값들을 반복해서 출력(td속성 갯수만큼), :not을 통해 필요없는 요소는 제외
      out.println(e.text());   
      out.println("|");	//복잡해져 구분을 위함
      i++;
      if(i==2){
        out.println("<br>"); //마찬가지로 문자열을 다듬어주었다.
        i=0;
      }

     }

		 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>