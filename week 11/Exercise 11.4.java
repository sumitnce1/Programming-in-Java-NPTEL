import java.sql.*;
import java.lang.*;
public class CalAverage {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              String query="";
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              
~~~THERE IS SOME INVISIBLE CODE HERE~~~

String st ="SELECT AVE(Age) from PLAYERS";
stmt.executeUpdate(st);

~~~THERE IS SOME INVISIBLE CODE HERE~~~
			
		}
                catch(Exception e){ System.out.println(e);}  
	}  
}  