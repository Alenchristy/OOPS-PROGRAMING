/*
Q5,  find the area of different shapes using overloaded functions
*/

import java.util.*;
class OverloadArea{
		void area(int a){    //method for square area
			System.out.println("area of square is: "+a*a);
			}

		void area(int l, int b){        //method for rectangle area
			System.out.println("area of triangle is: "+l*b);
			}

		void area(double r){           //method for circle area
			System.out.println("area of circle is: "+3.14*r*r);
			}
		}

class Overloading{
	public static void main(String args[]){          //main method
	
		Scanner obj=new Scanner(System.in);
		OverloadArea ar=new OverloadArea();      //object of class overloadarea
		
		System.out.println("1.square\n2.rectangle\n3.circle");
		System.out.print("enter your option: ");
		int opt=obj.nextInt();
		System.out.println("==================================");
		switch(opt){
			case 1:System.out.println("square");
			             System.out.println("enter the side of square: ");
			             int side=obj.nextInt();
			             ar.area(side);
			             break;

			case 2:System.out.println("rectangle");
			            System.out.println("enter length of rectangle:  ");
			            int leng=obj.nextInt();
			            System.out.println("enter breadth of rectangle:  ");
			            int brth=obj.nextInt();
			            ar.area(leng,brth);
			            break;

			case 3:System.out.println("circle");
			            System.out.println("enter the radius of circle: ");
			            int rad=obj.nextInt();
			            ar.area(rad);
			            break;

			}

		}
	}

/*
Output
1.square
2.rectangle
3.circle
enter your option: 1
==================================
square
enter the side of square:
6
area of square is: 36


1.square
2.rectangle
3.circle
enter your option: 2
==================================
rectangle
enter length of rectangle:
7
enter breadth of rectangle:
5
area of rectangle is: 35


1.square
2.rectangle
3.circle
enter your option: 3
==================================
circle
enter the radius of circle:
7
area of circle is: 49
*/

