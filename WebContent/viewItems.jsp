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
 <h1>this is view Items</h1>
  <form action="ShoppingBasket">
	<jsp:useBean id="itemControl" class="com.eshopproject.models.ItemControl"/>
		<jsp:useBean id="items" class="com.eshopproject.models.Item"/>  
	
	<table border = "1">
	
		<tr>
		     <td><b>click</b></td> 
			<td>Id</td>
		
			<td>Name</td>
			
			<td>Description</td>
			
			<td>Category</td>
			
			<td>Price</td>
		</tr>
		 <%
	        	 ItemControl myItemControl = new ItemControl();
	 			for(Item item: myItemControl.getAllItems()){
	 			
	     %>
			<tr>
				<td><input name= "id"  type="checkbox"  value=<%=item.getID()%>></td>
				<td><%=item.getID()%></td>
				<td><%=item.getName()%></td>
				<td><%=item.getDes()%></td>
				<td><%=item.getCategory()%></td>
				<td><%=item.getPrice()%></td>
			</tr>	
		<%} %>
	</table>
	
<br>

 <table width="200" border="0" >
                    <tr>

                        <td>
                               <input type="submit" name ="purchase" value="shapping basket">
                               
                         </td>
					
                    </tr>
                </table>	
</form>
  	

</body>
</html>