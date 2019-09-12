//Add necessary codes to print the following:
-----------------OUTPUT-------------------

Name of thread 't':Thread-0
New name of thread 't':NPTEL
Thread is running.
-------------------------------------------------


class Question65 extends Thread{  
  public void run(){  
    System.out.println("Thread is running.");  
  }  
 public static void main(String args[]){  
    Question65 t=new Question65();  
    System.out.println("Name of thread 't':"+ t.getName());  
    
// Write the necessary code below...
t.start();
t.setName("NPTEL");

  System.out.println("New name of thread 't':"+ t.getName());  
 }  
}