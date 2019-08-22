//To the generation of Fibonacci numbers.
import java.util.Scanner; //This package for reading input
public class Fibonacci { 
    
    public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt(); //Read an integer
        System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
                                     //number
    } 
 static int fib(int n) {
//1st MEthod     
//complete the code segment to find the nth Fibonacci number in the Fibonacci sequence and return the value. Write the function recursively.
		int j=n-1;
		if( j == 0 )
		{
			return 0;
		}
		else if( j == 1 )
		{ 
			return 1;
 		}
		else 
		{
			return (fib(n-2)+fib(n-1));
		}
	}
}



//2nd MEthod

static int fib(int n) {
    int fib=0,f1=-1,f2=1;
     for(int i=0;i<n;i++)
       {
         fib=f1+f2;
         f1=f2;
         f2=fib;
       }
    return fib;
}
}
