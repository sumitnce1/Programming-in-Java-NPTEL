// Consider First n even numbers starting from zero(0) and calculate sum of all the numbers divisible by 3 from 0 to n. Print the sum.
import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,t;
 //Use for or while loop do the operation
		for(int i=0;i<=n;i++)
		{
			t = 2*(i);
			if(t%3 == 0)
			{
				sum += t;
			}
		}
		System.out.println(sum);
	}
}
