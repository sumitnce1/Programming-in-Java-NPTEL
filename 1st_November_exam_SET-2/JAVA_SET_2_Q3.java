import java.util.Scanner;
public class Question3{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         int s;
         s = input.nextInt();//define size of array 
      //The array is defined "arr" and elements are of  integer type.
        int[] arr = new int[s];   
       for(int i=0;i<arr.length;i++)
	   {
 	   arr[i]=input.nextInt();
          } 
        
        
        
        //Find the average of all odd numbers present in that array and print the same.
int j,sum=0,count=0;
double avg=0;
for(j=0;j<s;j++)
{
  if(arr[j]%2!=0)
  {
    count++;
    sum+=arr[j];
  }
}
avg=(double)sum/count;
if(count==0)
{
  avg=0;
System.out.print(avg);
}else
System.out.print(avg);
}
}