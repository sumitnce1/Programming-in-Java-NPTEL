import java.util.Scanner;
public class Question94{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        
        String arr[]=new String[5];
    for(int i=0;i<5;i++)
        arr[i]=sc.nextLine();
    
char matrix[][]=new char[5][5];
for(int i=0;i<5;i++){
 char[] chararray=arr[i].toCharArray();
  for(int j=0;j<5;j++){
   matrix[i][j]=chararray[j];
  }
}
for(int i=0;i<5;i++){
    for(int j=4;j>=0;j--)
        System.out.print(matrix[i][j]);
    System.out.println();
}

	} // The main() method ends here
} // The main class ends here