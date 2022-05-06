/*
5. Create an Arithmetic package that has classes and interfaces
for the 4 basic arithmetic operations. Test the package by
implementing all operations on two given numbers
*/

import arithmetic.*;

 class a{
	public static void main(String arg[]){
	System.out.println("area of different shapes");
	System.out.println("------------------------");

	Add a=new Add();
	a.result(5,6);

	Mul m=new Mul();
	m.result(4,7);

	Sub c=new Sub();
	c.result(7,4);

	Div d=new Div();
	d.result(3,6);

	}
}
