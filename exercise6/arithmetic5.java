/*
5. Create an Arithmetic package that has classes and interfaces
for the 4 basic arithmetic operations. Test the package by
implementing all operations on two given numbers
*/

import arithmetic.*;
import java.util.*;

 class ar{
	public static void main(String arg[]){

	Scanner o=new Scanner(System.in);
	System.out.print("enter two numers: ");
	int x=o.nextInt();
	int y=o.nextInt();

	System.out.println("\n4 basic arithmetic operations");
	System.out.println("-----------------------------");

	System.out.println("\naddition ("+x+"+"+y+") ->");
	Add a=new Add();
	a.result(x,y);

	System.out.println("\nmultiplication ("+x+"*"+y+") ->");
	Mul m=new Mul();
	m.result(x,y);

	System.out.println("\nsubtraction ("+x+"-"+y+") ->");
	Sub c=new Sub();
	c.result(x,y);

	System.out.println("\ndivision ("+x+"/"+y+") ->");
	Div d=new Div();
	d.result(x,y);

	}
} 

/*

Output

enter two numers: 3 8

4 basic arithmetic operations
-----------------------------

addition (3+8) ->
result: 11

multiplication (3*8) ->
result: 24

subtraction (3-8) ->
result: -5

division (3/8) ->
result: 0.375


*/
