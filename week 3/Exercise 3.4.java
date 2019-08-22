// This program to exercise the call of static and non-static methods. A partial code is given defining two methods, namely sum( ) and multiply ( ). You have to call these methods to find the sum and product of two numbers.
import java.util.Scanner;
class QuestionScope {
    int sum(int a, int b){ //non-static method
        return a + b;
    }
    static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class Test3{
   public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
//Called the method sum() to find the sum of two numbers.
	QuestionScope q = new QuestionScope();
	int sum;
	sum= q.sum(n1,n2);
//Called the method multiply() to find the product of two numbers.
	int multy= q.multiply(n1,n2);
	System.out.println(sum);
	System.out.print(multy);

 }  
} 