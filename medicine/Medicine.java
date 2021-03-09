package medicine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Medicine 
{
    private String name;
    private String company;
    private String manu;
    private  String expiry;
    private String rate;
    private String mrp;
    private String gst;
    private String quantity;
    private String type;
    
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

	public String getRate() {
		return rate;
	}

	public String getMrp() {
		return mrp;
	}

	public String getGst() {
		return gst;
	}
    
	public String getQuantity() {
		return quantity;
	}
	

	public String getType() {
		return type;
	}

	public boolean addMedicine(String name,String company,String manu,String expiry,String rate,String mrp,String gst,String quantity,String type)
    {
    	int row=0;
    	Connection con=utility.DBUtility.connection();
    	String query="insert into medicine values(?,?,?,?,?,?,?,?,?)";
    	try
    	{
    	    PreparedStatement stmt= con.prepareStatement(query);
    	    stmt.setString(1,name);
    	    stmt.setString(2,company);
    	    stmt.setString(3,manu);
    	    stmt.setString(4,expiry);
    	    stmt.setString(5,rate);
    	    stmt.setString(6,mrp);
    	    stmt.setString(7,gst);
    	    stmt.setString(8,quantity);
    	    stmt.setString(9,type);
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
    
    public boolean updateMedicine(String name,String company,String manu,String expiry,String rate,String mrp,String gst,String quantity,String type)
    {
    	int row=0;
       	Connection con=utility.DBUtility.connection();
       	String query="update medicine set company=?,manu=?,expiry=?,rate=?,mrp=?, gst=?, quantity=?, type=? where name=?";
       	try
       	{
       	    PreparedStatement stmt= con.prepareStatement(query);
 	        stmt.setString(1,company);
 	        stmt.setString(2,manu);
 	        stmt.setString(3,expiry);
 	        stmt.setString(4,rate);
 	        stmt.setString(5,mrp);
 	        stmt.setString(6,gst);
 	        stmt.setString(7,quantity);
 	        stmt.setString(8,type);
      	    stmt.setString(9,name);
      	   
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
    
    public boolean deleteMedicine(String name)
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
    
    public Medicine getMedicine(String name)
    {
       
  	   ResultSet rs;
  	   Connection con=utility.DBUtility.connection();
       String query="select * from medicine where name='"+name+"'";
       Medicine m=new Medicine();
         
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
  			 m.rate=rs.getString("rate");
  			 m.mrp=rs.getString("mrp");
  			 m.gst=rs.getString("gst");
  			 m.quantity=rs.getString("quantity");
  			 m.type=rs.getString("type");
  		}
  	   }
  	   catch (SQLException e) 
  	   {
  		e.printStackTrace();
  	   }
  	  return m;
    }
    
    public boolean alreadyMedicine(String name)
    {
    	int count=0;
  	    ResultSet rs;
  	    Connection con=utility.DBUtility.connection();
        String query="select name from medicine";
         
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
