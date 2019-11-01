import java.util.Scanner;
public class Question2{
    public static void main(String[] args) {
        
        
        Scanner su=new Scanner(System.in);
int s=su.nextInt();
int min,arr[];
arr=new int[s];
for(int i=0;i<s;i++)
  arr[i]=su.nextInt();
min=arr[0];
for(int i=1;i<s;i++)
{
  if(min>arr[i])
    min=arr[i];
}
System.out.print(min);
}
}


