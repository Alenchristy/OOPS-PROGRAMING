/*
4. Create a Graphics package that has classes and interfaces for
figures Rectangle, Triangle, Square and Circle. Test the package by
finding the area of these figures.
*/
 import java.util.*;
import graphics.*;

 class shapes{
	public static void main(String arg[]){

	System.out.println("\nArea of different shapes");
	System.out.println("------------------------");
	
	Scanner o=new Scanner(System.in);

	System.out.println("Rectangle->");
	System.out.print("enter length: ");
	int l=o.nextInt();

	System.out.print("enter breadth: ");
	int b=o.nextInt();
	Rec e=new Rec();
	e.area(l,b);

	
	System.out.println("\nSquare->");
	System.out.print("enter side: ");
	int s=o.nextInt();
	Sq a=new Sq();
	a.area(s);


	
	System.out.println("\nCircle->");
	System.out.print("enter radius: ");
	int r=o.nextInt();
	Cir c=new Cir();
	c.area(r);

	System.out.println("\nTriangle-> ");
	System.out.print("enter base: ");
	int x=o.nextInt();

	System.out.print("enter height: ");
	int h=o.nextInt();
	Tr t=new Tr();
	t.area(x,h);
	}
}

/*
Output

Area of different shapes
------------------------
Rectangle->
enter length: 4
enter breadth: 5
area of rectangle: 20

Square->
enter side: 4

area of square: 16

Circle->
enter radius: 5

area of circle: 78.5

Triangle-> 
enter base: 5
enter height: 6

area of triangle: 15.0

*/	
	
		
