import java.sql.*;
import java.lang.*;
public class UpdateData {
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

String sql = "UPDATE PLAYERS " + "SET Age = 24 WHERE UID == 1";
stmt.executeUpdate(sql); 
String sql1 = "UPDATE PLAYERS " + "SET Last_Name = 'Gopala' WHERE UID == 1";
stmt.executeUpdate(sql1);
String sql2 = "UPDATE PLAYERS " + "SET First_Name = 'Rama' WHERE UID == 1";
stmt.executeUpdate(sql2);

~~~THERE IS SOME INVISIBLE CODE HERE~~~
		}
                catch(Exception e){ System.out.println(e);}  
	}  
}  
