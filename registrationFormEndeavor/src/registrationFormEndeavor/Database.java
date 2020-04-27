package registrationFormEndeavor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

 /* //toString method overriding example
    @Override
	public String toString() {
		return "An error occurred.";
	}
 */	
    
	public static void main(String[] args) {	
		
        try {
		    Class.forName("com.mysql.cj.jdbc.Driver");  
		    Connection conn = DriverManager.getConnection(  
		    "jdbc:mysql://localhost:3306/usersaccountsdata","root","noentrance4424"); 
		    System.out.println("Connection established.");
		    Statement stmt = conn.createStatement();
		    ResultSet rs;
		    } 
    
        catch (Exception ex) 
            {
			System.out.println("Sorry, a connection error occurred.");
			ex.printStackTrace();
		    }
	 
	}
	
	protected void dbClose() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
		    Connection conn = DriverManager.getConnection(  
		    "jdbc:mysql://localhost:3306/usersaccountsdata","root","noentrance4424"); 
		    System.out.println("Connection established.");
			conn.close();
			System.out.println("Finished.");	
		} 
		
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
		
	}
	
}
