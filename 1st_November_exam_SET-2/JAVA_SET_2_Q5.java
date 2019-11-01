import java.util.Scanner;
interface Number {
    int findCube(int i);  // Returns the cube of a number
}


//Create a class A which implements the interface Number.
class A implements Number
{
public int findCube
(int num)
{
return num*num*num;
}
}


public class Question5{ 
     public static void main (String[] args){ 
           A a = new A();   //Create an object of class A
           // Read a number from the keyboard
           Scanner sc = new Scanner(System.in);  
           int n = sc.nextInt();
           System.out.print(a.findCube(n)); 
    } 
}