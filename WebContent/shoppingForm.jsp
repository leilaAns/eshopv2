<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "com.eshopproject.models.*"
    import = "java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="itemControl" class="com.eshopproject.models.ItemControl"/>
		<jsp:useBean id="items" class="com.eshopproject.models.Item"/>  
<form action="ShoppingPay">	
	<table >
	
		<tr>
		   
			<td>Id</td>
		
			<td>Name</td>
			
			<td>Description</td>
			
			<td>Category</td>
			
			<td>Price</td>
		</tr>
		 <%
		    if((ArrayList<Item>)request.getSession().getAttribute("selectedItems") != null){
		    	ArrayList<Item> selectedItems = (ArrayList<Item>)request.getSession().getAttribute("selectedItems");
	 			for(Item item: selectedItems){
	 			
	     %>
			<tr>
				
				<td><%=item.getID()%></td>
				<td><%=item.getName()%></td>
				<td><%=item.getDes()%></td>
				<td><%=item.getCategory()%></td>
				<td><%=item.getPrice()%></td>
			</tr>	
		<% 
			}
	 			}%>
	 			
	 		
	 </table>
	 <table>
	 	<tr>
	 		<td>total</td>
				<td><%= request.getAttribute("total")%></td>
	 	</tr>
	 </table>
	
	 	<br>
	   <input type="submit" name ="pay" value="pay">		
</form>
</body>
</html>