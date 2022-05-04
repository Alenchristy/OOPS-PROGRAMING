/*Create an interface having prototypes of
functions area() and perimeter(). Create two
classes Circle and Rectangle which implements
the above interface. Create a menu driven
program to find area and perimeter of objects.*/

import java.util.*;

interface AP{
	void input();
	void area();
	void perimeter();

}

class Circle implements AP{
	Scanner c=new Scanner(System.in);
	int r=0;
	double pi=3.14;
	double area=0;
	double peri=0;

	public void input(){
		System.out.print("enter radius: ");
		this.r=c.nextInt();
	}

	public void area(){
		area=pi*r*r;
		System.out.println("area: "+area);
	}

	public void perimeter(){
		peri=2*pi*r;
		System.out.println("perimeter: "+peri);
	}
}


class Rectangle implements AP{
	Scanner r=new Scanner(System.in);
	int l=0;
	int b=0;
	double area=0;
	double peri=0;

	public void input(){
		System.out.print("enter length and breadth: ");
		this.l=r.nextInt();
		this.b=r.nextInt();
	}

	public void area(){
		area=l*b;
		System.out.println("area: "+area);

	}


	public void perimeter(){
		peri=2*(l+b);
		System.out.println("perimeter: "+peri);
	}
}


class main{
	public static void main(String arg[]){
		Scanner s=new Scanner(System.in);
		Circle c=new Circle();
		Rectangle r=new Rectangle();
;       do{
		System.out.println("1.circle\n2.rectangle\n3.exit");
		System.out.println("enter your option: ");
		int opt=s.nextInt();
		switch(opt){
		case 1:System.out.println("\ncircle->");
				c.input();
				c.area();
				c.perimeter();
				System.out.println("==========================");
				break;

		case 2:System.out.println("\nrectangle->");
				r.input();
				r.area();
				r.perimeter();
				System.out.println("==========================");
				break;
		case 3:System.out.println("exiting...");
				System.exit(0);
				break;

		}
	}while(true);


	}
}


/*
output
1.circle
2.rectangle
3.exit
enter your option:
1
circle->
enter radius: 6
area: 113.03999999999999
perimeter: 37.68
==========================
1.circle
2.rectangle
3.exit
enter your option:
2
rectangle->
enter length and breadth: 6 7
area: 42.0
perimeter: 26.0
==========================
1.circle
2.rectangle
3.exit
enter your option:
3
exiting...
*/
