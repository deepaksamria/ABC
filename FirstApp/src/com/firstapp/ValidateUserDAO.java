package com.firstapp;
import java.sql.*;
public class ValidateUserDAO {
	
	String sql="select * from student where username=? and pass=?";
	public boolean checkuser(String uname, String pass) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deepak","root",null);
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, uname);
		st.setString(2, pass);
		ResultSet rs=st.executeQuery();
		if(rs.next()) {
			return true;
		}
		else 
		return false;
	}
	

}
