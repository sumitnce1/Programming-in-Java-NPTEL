import java.sql.*;
import java.lang.*;
public class CreateTable {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              
              
           String sql = "CREATE TABLE PLAYERS " +
                   "(UID INT, " +
                   " First_Name VARCHAR(45), " + 
                   " Last_Name VARCHAR(45), " + 
                   " Age INT, " + 
                   " PRIMARY KEY ( UID ))"; 

      stmt.executeUpdate(sql);   
      
      ~~~THERE IS SOME INVISIBLE CODE HERE~~~
              }
       catch(Exception e){ System.out.println(e);}  
    }
}