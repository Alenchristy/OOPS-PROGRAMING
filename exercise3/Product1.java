/*
Experiment-3
Q1,Define a class ‘product’ with data members pcode, pname and price.
Create 3 objects of the class and find the product having the lowest
price
*/

import java.util.*;

class Product{                  //creating class product
	int pcode;       
	double pprice;     //declaring variables
	String pname;
	void disp(){
		System.out.println("product code is-> " +pcode+ " and the product price is->"+pprice);
		}
	}

public class Product1{                //main class
	public static void main(String args[]){            //main function
		Scanner ob=new Scanner(System.in);
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();

                                      //details for product 1,2&3
              		
		System.out.println("enter the details of 1st product: ");
		System.out.print("product name: ");
		p1.pname=ob.next();
  		System.out.print("product code: ");
		p1.pcode=ob.nextInt();
		System.out.print("product price: ");
		p1.pprice=ob.nextDouble();
		System.out.print("*********************\n");

		System.out.println("enter the details of 2nd product: ");
		System.out.print("product name: ");
		p2.pname=ob.next();
  		System.out.print("product code: ");
		p2.pcode=ob.nextInt();
		System.out.print("product price: ");
		p2.pprice=ob.nextDouble();
		System.out.print("*********************\n");

		System.out.println("enter the details of 3rd product: ");
		System.out.print("product name: ");
		p3.pname=ob.next();
  		System.out.print("product code: ");
		p3.pcode=ob.nextInt();
		System.out.print("product price: ");
		p3.pprice=ob.nextDouble();
		System.out.print("*********************\n");
		

     //checking for the lowest price product
	if(p1.pprice<p2.pprice){
		
		if(p1.pprice<p3.pprice){
				System.out.println("the product "+p1.pname+" has the lowest price\n");
				p1.disp();
				}
		else{
			System.out.println("the product "+p3.pname+" has the lowest price");
			p3.disp();
		        }
                        }

	else{
		if(p2.pprice<p3.pprice){
				System.out.println("the product "+p2.pname+" has the lowest price");
				p2.disp();
				}
		else{
			System.out.println("the product "+p3.pname+" has the lowest price");
			p3.disp();
		        }
	      }
	}
}
/*
Output
----------
enter the details of 1st product:
product name: book
product code: 101
product price: 50
*********************
enter the details of 2nd product:
product name: pen
product code: 105
product price: 20
*********************
enter the details of 3rd product:
product name: bag
product code: 111
product price: 1100
*********************
the product pen has the lowest price
product code is-> 105 and the product price is->20.0
*/