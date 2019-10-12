import java.sql.*;
import java.lang.*;
public class InsertData {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
~~~THERE IS SOME INVISIBLE CODE HERE~~~

PreparedStatement stmt1=conn.prepareStatement("insert into PLAYERS values(?,?,?,?)");
		stmt1.setInt(1,1);
		stmt1.setString(2,"Ram");
		stmt1.setString(3,"Gopal");
		stmt1.setInt(4,26);
		int i=stmt1.executeUpdate();
PreparedStatement stmt2=conn.prepareStatement("insert into PLAYERS values(?,?,?,?)");
		stmt2.setInt(1,2);
		stmt2.setString(2,"John");
		stmt2.setString(3,"Mayer");
		stmt2.setInt(4,22);
		int i1=stmt2.executeUpdate();
        
        
~~~THERE IS SOME INVISIBLE CODE HERE~~~
		}
                catch(Exception e){ System.out.println(e);}  
	}  
}  
