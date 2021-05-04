package com.firstapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class addCandidateDAO {
	

	public boolean addCandidate(String ncan, String mob, String email, String city) throws Exception
	{
		
		String sql="insert into candidate (name, mob, email, city) values (?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deepak","root",null);
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, ncan);
		st.setString(2, mob);
		st.setString(3, email);
		st.setString(4, city);
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
