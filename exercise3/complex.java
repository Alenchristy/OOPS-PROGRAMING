/*Add two complex numbers*/
import java.util.*;

class Complex{
		int real;
		int imag;
		Complex(int r,int i){ //constructor for seting data
			 this.real=r;
			 this.imag=i;
		}
		static Complex complexAdd(Complex c1,Complex c2){ //methord for add two complex numbers
				Complex temp =new Complex(0,0);
				temp.real=c1.real+c2.real;
				temp.imag=c1.imag+c2.imag;
				return temp;
		
		
		} 
		static void showComp(Complex tmp){  //display methord
				System.out.println(tmp.real+"+i"+tmp.imag);
		
		
		}
		public static void main(String ar[]){
				Scanner obj=new Scanner(System.in);
				System.out.println("Complexnumber 1");
				System.out.print("Enter Real part:");
				int r=obj.nextInt();
				System.out.print("Enter imag part:");
				int i=obj.nextInt();
				Complex c= new Complex(r,i);
				System.out.print("\nComplex num 1:");
				showComp(c);
				System.out.println("----------------------");
				
				
				
				System.out.println("Complexnumber 2");
				System.out.print("Enter Real part:");
				int r1=obj.nextInt();
				System.out.print("Enter imag part:");
				int i1=obj.nextInt();
				Complex c1= new Complex(r1,i1);
				System.out.print("\nComplex num 1:");
				showComp(c1);
				System.out.println("----------------------");
				
				
				Complex tmp=new Complex(0,0);
				tmp=complexAdd(c,c1);
				System.out.print("\nResult:");
				
				showComp(tmp);
				
				
		
		
		}


}
/*

output

Complexnumber1
Enter Real part:1
Enter imag part:2

Complex num 1:1+i2
----------------------
Complexnumber2
Enter Real part:3
Enter imag part:4

Complex num 1:3+i4
----------------------

Result:4+i6

*/
