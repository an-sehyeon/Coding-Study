<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Login</title>
</head>
<body>
<%
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	
	// userid : Apple, passwd : 111 인 것만 인정
	if(userid.equals("Apple") && passwd.equals("111")){
		// session에 저장
		session.setAttribute("userid", userid);
		response.sendRedirect("11_session.jsp");
	}
	else{
		
	
%>
		<script>
			alert("너 누구야");
			location.href="11_session.jsp";
		</script>
<%
	}
%>
</body>
</html>