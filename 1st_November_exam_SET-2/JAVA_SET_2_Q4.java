import java.util.Scanner;
public class Question4{
    public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
        
        Scanner s = new Scanner(System.in);
char ch = s.next().charAt(0);
if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
  System.out.print("vowel");
else
  System.out.print("Not_vowel");
	}
}