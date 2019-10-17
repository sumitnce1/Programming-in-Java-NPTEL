import java.net.*;  
public class Question2{  
   public static void main(String[] args){  
   
   
     try{  
     URL url=new URL("http://www.Nptel.com/java-tutorial");    
    //use appropriate method() to print the protocol name and host name from url 
    //Write the method() by replacing the blank space.
     System.out.println("Protocol: "+url.getProtocol());  
     System.out.println("Host Name: "+url.getHost());
 
      }
   catch(Exception e){System.out.println(e);}  
   }  
} 