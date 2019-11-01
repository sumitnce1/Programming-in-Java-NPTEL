import java.util.Scanner;
public class Question4{
	public static void main(String args[]){


Scanner s=new Scanner(System.in);
char ch = s.next().charAt(0);
if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
ch = Character.toLowerCase(ch);
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){}
else{
       System.out.print("Consonant");
}
}

	} // main() ends here
} // Class Question4 ends here