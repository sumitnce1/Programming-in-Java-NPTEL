import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        
        
        
        Scanner s = new Scanner(System.in);
 int n = s.nextInt();

 int x = 1;
 int sum = 0;
 for (int i = 0; i < n; i++)
 {
  sum += x;
  x += 2;
  
 }
 System.out.print(sum);
}}