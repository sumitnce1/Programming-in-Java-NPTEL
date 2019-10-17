class Parent {
    public static void testClassMethod() {
        System.out.println("The static method.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method.");
    }
}
public class Child extends Parent {
   public static void testClassMethod() {
        
    }
    
    
    public static void main(String[] args) {
     		Child nce=new Child(); 
            nce.testInstanceMethod();
            Parent.testClassMethod();
	}	
}
	 
    
    
    