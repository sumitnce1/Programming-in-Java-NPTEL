import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	int rows = inr.nextInt();
       int i,j,k,c,t=1,s=0;
   
    c=rows-1;
   
    for(i=1;i<=rows;i++)
    {
         int start=1;
        for(j=1;j<=c;j++)
        {
            System.out.print("  ");
            
        }
        for(k=1;k<=t;k++)
        {
            System.out.print(start+" ");
          s=start+s;
            start++;
                
        }
        c--;
        t+=2;
        
        System.out.print("\n");
    }    
      System.out.print(s);
}
}