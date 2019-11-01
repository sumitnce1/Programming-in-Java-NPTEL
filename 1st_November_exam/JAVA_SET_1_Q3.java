import java.util.Scanner;
public class Question3{
	public static void main(String args[]){

        int arr[] = new int[6];

        // Array initialization is hidden
        
       ~~~THERE IS SOME INVISIBLE CODE HERE~~~ 
        
        
int j=0,sum=0;
for(int i=0;i<6;i++)
{
	if(arr[i]%2==0)
    {
    	j++;
      sum=sum+arr[i];
    }
}
if(j==0)
{
  System.out.print(0);
}
else
{
System.out.print((float)sum/j);
}


	} // main() ends here
} // Class Question2 ends here

