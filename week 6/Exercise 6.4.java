//Execution of two or more threads occurs in a random order. The keyword 'synchronized' in Java is used to control the execution of thread in a strict sequence. In the following, the program is expected to print some numbers. Do the necessary use of 'synchronized' keyword, so that, the program prints the output in the following order:  
-----------------OUTPUT-------------------

5
10
15
20
25
100
200
300
400
500
-------------------------------------------------


class Execute{ 
synchronized void print(int n){
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){
        System.out.println(e);
     }  
   }
 }
 }// Ending Execute class
 
 class Thread1 extends Thread{  
	Execute t;  
	Thread1(Execute t){  
		this.t=t;  
	}  
	public void run(){  
		t.print(5);  
	} 
}  

class Thread2 extends Thread{  
	Execute t;  
	Thread2(Execute t){  
		this.t=t;  
	}  
	public void run(){  
		t.print(100);  
	}  
}  
  
public class Question64{  
	public static void main(String args[]){  
		Execute obj = new Execute();//only one object  
		Thread1 t1=new Thread1(obj);  
		Thread2 t2=new Thread2(obj);  
		t1.start();  
		t2.start();  
	}  
}  