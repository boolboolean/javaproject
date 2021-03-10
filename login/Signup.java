package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Signup 
{
    public boolean signup(String firstName, String lastName, String username,String mobile,String address,String password )
    {
    	
    	int row=0;
    	Connection con=utility.DBUtility.connection();
    	String query="insert into login values(?,?,?,?,?,?)";
    	try
    	{ 
    	    PreparedStatement stmt= con.prepareStatement(query);
    	    stmt.setString(1,firstName);
    	    stmt.setString(2,lastName);
    	    stmt.setString(3,username);
    	    stmt.setString(4,mobile);
    	    stmt.setString(5,address);
    	    stmt.setString(6,password);
    	    row=stmt.executeUpdate();
    	}
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    	
    	if(row>0)
    	   return true;
    	else
    	   return false;
    }
    
    public boolean alreadyUser(String username)
    {
    	int count=0;
 	   ResultSet rs;
 	   Connection con=utility.DBUtility.connection();
        String query="select username from login";
        
 	   try 
 	   {
 		Statement stmt=con.createStatement();
 	    rs=stmt.executeQuery(query);
 	    while(rs.next())
 		{
 			 if(username.equals(rs.getString("username")) )
 			 {
 				 count=1;
 			 }
 		}
 	   }
 	   catch (SQLException e) 
 	   {
 		e.printStackTrace();
 	   }
 	   
 	   if(count==1)
 	   {
 		   count=0;
 		   return true;
 	   }
 	   else 
 		   return false;   
    }
}
