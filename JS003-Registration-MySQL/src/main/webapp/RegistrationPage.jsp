<%@page import="java.sql.*"%>
<%
String name = request.getParameter("name");
String password = request.getParameter("pass");
String address = request.getParameter("address");
String phone = request.getParameter("phone");
int telno = Integer.parseInt(phone);


String connectionURL = "jdbc:mysql://localhost:3306/jdbctasks";
Connection con = null;
try {
	
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection(connectionURL, "root", "root");
	
	
	PreparedStatement ps = con.prepareStatement("insert into userReg(name,password,address,telno) values(?,?,?,?)");
	ps.setString(1, name);
	ps.setString(2, password);
	ps.setString(3, address);
	ps.setInt(4, telno);
	int i = ps.executeUpdate();
	out.println("Record Inserted  " + i);
	ps.close();

} catch (Exception ex) {
	out.println(ex);
}
%>