/*
Q4, add two complex numbers
*/

import java.util.*;
class Complex
{
	int r;
	int i;

     Complex(int a,int b) //to initialise
	{
	  r=a;
	  i=b;
	}


     public static void main(String args[])
     {
	int c;
	int d;
                   Scanner s=new Scanner(System.in);       //Creating Scanner Class Object


	System.out.println("enter real and imaginary part of the 1st complex number: ");
	//reading first
	int x=s.nextInt();
	int y=s.nextInt();

	Complex obj1=new Complex(x,y);         //passing
	System.out.println("========================================");
	System.out.println("\nenter real and imaginary part of the 2nd complex number: ");
	//reading second
	int p=s.nextInt();
	int q=s.nextInt();

	Complex obj2=new Complex(p,q); //passing
	c=obj1.r+obj2.r;          //adding real part
	d=obj1.i+obj2.i;         //adding imaginary part

	System.out.println("========================================");
	System.out.println("\nsum of the two complex number is-> "+c+"+i"+d);

	}

      }

/*
Output
enter real and imaginary part of the 1st complex number:
1 2
===============================================

enter real and imaginary part of the 2nd complex number:
3 4
===============================================

sum of the two complex number is-> 4+i6
*/

			
