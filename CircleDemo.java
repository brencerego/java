package circle;

import java.util.Scanner;

class Circle {
	double radius;
	final double pi = 3.14;
	
	public Circle() {
		radius = 0;
	}

   public Circle( double r ) {
	   radius = r;
	   
   }   
   
   public void readRadius() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the radius");
	   radius = sc.nextDouble();
	   sc.close();
   }
  
   public void area()
   {
	   System.out.print(" Area of Circle :");
	   System.out.println(pi*radius*radius);
	   
   }
   
   public void circum()
   {
	   System.out.print(" Circumference of Circle :");
	   System.out.println(2*pi*radius);
	   	   
   }
   
}
public class CircleDemo {
public static void main(String[] args)
{
	Circle c1= new Circle();
	c1.readRadius();
	c1.area();
	c1.circum();
}
}