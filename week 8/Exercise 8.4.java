import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	int n = inr.nextInt();
      int k ;
        // Add the necessary code in the below space
      if(n % 2 == 0)
        System.out.print("Invalid line number");
      else{
        for(int i = 0; i < n; i++){
          k = 0;
          if(i <= n/2){
          for(int j = n - i; j > n/2 + 1;j--){
            System.out.print(" ");
          }
            while(k < ( i + 1 )){
              System.out.print("*" + " ");
            k++;
            }
          }
          else{
            for(int j = n-i; j < n/2 + 1;j++)
              System.out.print(" ");
            while(k < (n- i  )){
              if(k == n-i-1)
                System.out.print("*");
              else{
              System.out.print("*");
              System.out.print(" ");
              }
            k++;
            }
          }
          if(i != n-1)
           System.out.println( );
        }
      }
    }
}