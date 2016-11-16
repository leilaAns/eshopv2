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
<form action="AddNewItem">
<jsp:useBean id="itemControl" class="com.eshopproject.models.ItemControl"/>
<jsp:useBean id="items" class="com.eshopproject.models.Item"/> 
<%
	Item item = (Item)request.getAttribute("Item"); 
	if(item == null){
	
%>
	ID <input type="text" name="id"><br/>
	Name <input type="text" name="name"><br/>  
	Description <input type="text" name="des"><br/>  
	Category <input type="text" name="cat"><br/>  
	Price <input type="text" name="price"><br/>  
<%
	}
	else
	{
		
	%>		
		ID <input type="text" name="id" value=<%= item.getID() %>><br/>
		Name <input type="text" name="name" value= <%= item.getName() %>><br/>  
		Description <input type="text" name="des" value= <%= item.getDes() %>><br/>  
		Category <input type="text" name="cat" value= <%= item.getCategory() %>><br/>  
		Price <input type="text" name="price" value= <%= item.getPrice() %>><br/> 
<% 	
	}
%>
	
	<input type="submit" value="save">
</form>	    
</body>
</html>