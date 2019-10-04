import java.util.*;

public class Pattern5 {
   public static void main(String[] args) throws Exception {
           Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
     if(n==5){
       System.out.println(" _ ");
       System.out.println("|"+"_ ");
       System.out.print(" _"+"|");
     }
     if(n==4){
      System.out.println("   ");
       System.out.println("|_|");
       System.out.print("  |");
     }
     if(n==1){
      System.out.println("");
       System.out.println("  |");
       System.out.println("  |"); 
       }   
     }
   }