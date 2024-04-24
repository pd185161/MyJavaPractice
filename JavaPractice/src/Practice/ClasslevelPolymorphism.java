package Practice;


class Shape {
    int width, height;

     public Shape( int a, int b ) {
         width = a;
         height = b;
     }

     public int area() {
     System.out.println("Triangle class area :");
 System.out.println("Rectangle class area :");
         return 0;
     }
 }

 class Rectangle extends Shape {
     public Rectangle(int a, int b) {
         super(a, b);
     }

     public int area () {
 System.out.println("Parent class area :");
 return (width * height / 2);
     }
 }
 class Triangle extends Shape {
   public Triangle(int a , int b) {
       super(a, b);
     }
    
     public int area() {            
 System.out.println("Parent class area :");
         return (width * height);
     }
 }
 class Caller{
     
	public void CallArea(Shape sh) {
         int a;
         a = sh.area();
         System.out.println("Area: "+ a);
     }
 }
 class ClasslevelPolymorphism {
     public static void main(String[] args) {
         Caller c = new Caller();
         Rectangle r = new Rectangle(10, 7);
         Triangle t = new Triangle(10, 5);

         c.CallArea(r);
         c.CallArea(t);
     }
 }