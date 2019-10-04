import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
   int i, j, rows, k=0;
        Scanner scan = new Scanner(System.in);
        
        rows = scan.nextInt();
        for(i=1; i<=rows; i++)
        {
            for(j=1; j<=(rows-i); j++)
            {
                System.out.print("  ");
            }
            while(k != (2*i-1))
            {
                System.out.print("* ");
                k++;
            }
            k = 0;
            System.out.println();
         

        }
       System.out.print(rows*rows);
    }
}