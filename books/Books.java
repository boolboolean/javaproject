package books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Books 
{
    private String name;
    private String company;
    private String manu;
    private  String expiry;
    
	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getManu() {
		return manu;
	}

	public String getExpiry() {
		return expiry;
	}

	
	public boolean addMedicine(String name,String company,String manu,String expiry)
    {
    	int row=0;
    	Connection con=utility.DBUtility.connection();
    	String query="insert into medicine values(?,?,?,?)";
    	try
    	{
    	    PreparedStatement stmt= con.prepareStatement(query);
    	    stmt.setString(1,name);
    	    stmt.setString(2,company);
    	    stmt.setString(3,manu);
    	    stmt.setString(4,expiry);
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
    
    public boolean updateMedicine(String name,String company,String manu,String expiry)
    {
    	int row=0;
       	Connection con=utility.DBUtility.connection();
       	String query="update medicine set company=?,manu=?,expiry=? where name=?";
       	try
       	{
       	    PreparedStatement stmt= con.prepareStatement(query);
 	        stmt.setString(1,company);
 	        stmt.setString(2,manu);
 	        stmt.setString(3,expiry);
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
    
    public boolean deleteBooks(String name)
    {
    	int row=0;
       	Connection con=utility.DBUtility.connection();
       	String query="delete from medicine where name=?";
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
    
    public Books getBooks(String name)
    {
       
  	   ResultSet rs;
  	   Connection con=utility.DBUtility.connection();
       String query="select * from books where name='"+name+"'";
       Books m=new Books();
         
  	   try 
  	   {
  		Statement stmt=con.createStatement();
  	    rs=stmt.executeQuery(query);
  	    while(rs.next())
  		{
  			 m.name=rs.getString("name");
  			 m.company=rs.getString("company");
  			 m.manu=rs.getString("manu");
  			 m.expiry=rs.getString("expiry");
  		}
  	   }
  	   catch (SQLException e) 
  	   {
  		e.printStackTrace();
  	   }
  	  return m;
    }
    
    public boolean alreadyBooks(String name)
    {
    	int count=0;
  	    ResultSet rs;
  	    Connection con=utility.DBUtility.connection();
        String query="select name from books";
         
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

	public boolean addBooks(String mname, String com) {
		// TODO Auto-generated method stub
		return false;
	}
    
}
