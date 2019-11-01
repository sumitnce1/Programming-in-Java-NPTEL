interface ShapeX {
 public String base = "This is Shape1";
 public void display1();
}

// Interface ShapeY is created which extends ShapeX
interface ShapeY extends ShapeX {
 public String base = "This is Shape2";
 public void display2();
}

// Class ShapeG is created which implements ShapeY
class ShapeG implements ShapeY {
 public String base = "This is Shape3";
 //Overriding method in ShapeX interface
  
 public void display1() {
  System.out.println("ShapeX: " + ShapeX.base);
 }
 // Override method in ShapeY interface
  public void display2(){
  System.out.println("ShapeY: " + ShapeY.base);
}
}

// Main class Question5
public class Question5{
 public static void main(String[] args) {
  //Object of class shapeG is created and display methods are called.
  ShapeG circle = new ShapeG();
  circle.display1();
  circle.display2();
 }
}