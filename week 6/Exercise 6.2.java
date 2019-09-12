//In the following program, a thread class ThreadRun is created using the Runnable interface which prints "Thread using Runnable interface". Complete the main class to create a thread object of the class ThreadRun and run the thread,

class ThreadRun implements Runnable {
        public void run(){ 
            System.out.print("Thread using Runnable interface."); 
        } 
   }
   
   // Create main class Question62 with main() method and appropriate statements in it
public class Question62{
public static void main(String[] args){
  ThreadRun obj = new ThreadRun();
  Thread obj2 = new Thread(obj);
  obj2.start();
  
}
}