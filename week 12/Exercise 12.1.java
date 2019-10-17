import java.util.Scanner;
public class Question92{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
        
        
        char sumit[]=input.toCharArray(); 
int outflag=0; 
double sumitnce=0.0,lifeline=0.0;
String o1="" ,o2=""; 
double nce=0.0;

for(int i=0; i<sumit.length; i++)
	sumit[i]=gui_map(sumit[i]);

outerloop:
	for (int i=0; i<sumit.length; i++)
	{
  		int r=0;
  		if(sumit[i]=='+'||sumit[i]=='-'||sumit[i]=='/'||sumit[i]=='X'||sumit[i]=='=')
  		{
   		 for (int j=0; j<i; j++)
      		o1+=Character.toString(sumit[j]);
    		sumitnce=Double.parseDouble(o1);
    	 for(int k=i+1; k<sumit.length; k++)
    	{
      	   if(sumit[k]=='=')
      		{
        	outflag=1;
        	lifeline=Double.parseDouble(o2);
        	if(sumit[i]=='+')
        		nce=sumitnce+lifeline;
        	else if(sumit[i]=='-')
       		  nce=sumitnce-lifeline;
       	    else if(sumit[i]=='/')
         	 nce=sumitnce/lifeline;
        	else if(sumit[i]=='X')
         	 nce=sumitnce*lifeline;
        	break outerloop;
      }
      else
        o2+=Character.toString(sumit[k]);
    }
 }
 else if(sumit[i]=='R'||sumit[i]=='S'||sumit[i]=='F')
 {
   for (int j=0;j<i;j++)
     o1+=Character.toString(sumit[j]);
     sumitnce=Double.parseDouble(o1);
   		if(sumit[i]=='R')
          System.out.print(Math.sqrt(sumitnce));
   		else if(sumit[i]=='S')
          System.out.print(sumitnce*sumitnce);
        else if(sumit[i]=='F')
          System.out.print(1/sumitnce);
    }
}
	if(outflag==1)
      System.out.print(nce);
      
      
      	}// The main() method ends here.
	
// A method that takes a character as input and returns the corresponding GUI character
	static char gui_map(char in){
		char out = 'N';// N = Null/Empty
		char gm[][]={{'a','R'}
					,{'b','0'}
					,{'c','.'}
					,{'d','='}
					,{'e','1'}
					,{'f','2'}
					,{'g','3'}
					,{'h','+'}
					,{'i','4'}
					,{'j','5'}
					,{'k','6'}
					,{'l','-'}
					,{'m','7'}
					,{'n','8'}
					,{'o','9'}
					,{'p','*'}
					,{'q','S'}
					,{'r','F'}
					,{'s','C'}
					,{'t','/'}};
					/*
					R = Square root
					C = Clear/Restart
					F = Fraction
					S = Square
					*/
					
		// Checking for maps
		for(int i=0; i<gm.length; i++){
			if(gm[i][0]==in){
				out=gm[i][1];
				break;
			}
		}
		return out;
	}
}
      
      