package com.firstapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeleteUserDAO {
	public boolean deleteuser(int uid) throws Exception
	{
	String sql="delete from candidate where id=?";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deepak","root",null);
	PreparedStatement st=con.prepareStatement(sql);
	st.setInt(1, uid);
	int count=st.executeUpdate();
	st.close();
	con.close();
	if (count==1)
	{
		return true;
	}else
		return false;
	}
}
