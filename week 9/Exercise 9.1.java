import java.util.Scanner;
public class Question91{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6
        
        char[] arr = input.toCharArray();

char Operator = arr[1];
double num1 = (double)(arr[0]-'0');
double num2 = (double)(arr[2]-'0');

if(Operator == '+')
  System.out.print(input+" = "+Math.round(num1+num2));
else if(Operator == '-')
  System.out.print(input+" = "+Math.round(num1-num2));
  else if(Operator == '*')
  System.out.print(input+" = "+Math.round(num1*num2));
  else if(Operator == '/')
  System.out.print(input+" = "+Math.round(num1/num2));
  
  }
  }