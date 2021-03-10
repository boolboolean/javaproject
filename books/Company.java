package books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Company 
{
	    private String name;
	    private String mobile;
	    private String email;
	    private  String address;
		public String getName() {
			return name;
		}	
		public String getMobile() {
			return mobile;
		}
		
		public String getEmail() {
			return email;
		}
		
	    public String getAddress() {
			return address;
		}
		
		public boolean addCompany(String name,String mobile,String email,String address)
	    {
	    	int row=0;
	    	Connection con=utility.DBUtility.connection();
	    	String query="insert into company values(?,?,?,?)";
	    	try
	    	{
	    	    PreparedStatement stmt= con.prepareStatement(query);
	    	    stmt.setString(1,name);
	    	    stmt.setString(2,mobile);
	    	    stmt.setString(3,email);
	    	    stmt.setString(4,address);
	    	    
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
		
		public boolean updateCompany(String name,String mobile,String email,String address)
	    {
	    	int row=0;
	       	Connection con=utility.DBUtility.connection();
	       	String query="update company set mobile=?,email=?,address=? where name=?";
	       	try
	       	{
	       	    PreparedStatement stmt= con.prepareStatement(query);
	 	        stmt.setString(1,mobile);
	 	        stmt.setString(2,email);
	 	        stmt.setString(3,address);
	 	        stmt.setString(4,name);
	 	        
	      	   
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
	    
	    public boolean deleteCompany(String name)
	    {
	    	int row=0;
	       	Connection con=utility.DBUtility.connection();
	       	String query="delete from company where name=?";
	       	try
	       	{
	       	    PreparedStatement stmt= con.prepareStatement(query);
	 	        stmt.setString(1,name);
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
	    
	    public Company getCompany(String name)
	    {
	       
	  	   ResultSet rs;
	  	   Connection con=utility.DBUtility.connection();
	       String query="select * from company where name='"+name+"'";
	       Company c=new Company();
	         
	  	   try 
	  	   {
	  		Statement stmt=con.createStatement();
	  	    rs=stmt.executeQuery(query);
	  	    while(rs.next())
	  		{
	  			 c.name=rs.getString("name");
	  			 c.mobile=rs.getString("mobile");
	  			 c.email=rs.getString("email");
	  			 c.address=rs.getString("address");
	  		}
	  	   }
	  	   catch (SQLException e) 
	  	   {
	  		e.printStackTrace();
	  	   }
	  	  return c;
	    }
	    
	    public boolean alreadyCompany(String name)
	    {
	    	int count=0;
	  	    ResultSet rs;
	  	    Connection con=utility.DBUtility.connection();
	        String query="select name from company";
	         
	  	   try 
	  	   {
	  		Statement stmt=con.createStatement();
	  	    rs=stmt.executeQuery(query);
	  	    while(rs.next())
	  		{
	  			 if(name.equals(rs.getString("name")) )
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
	  	   {
	  		   return false;   
	  	   }
	    }
		
	   
	    
}
