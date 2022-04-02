/*program to accept three numbers from the user and prints increasing if the number are in increasing order,decreasing if the numbers are in decreasing order and neither increasing or decreasing order*/


import java.util.Scanner;
        class Number{
          public static void main(String args [])
             {
		Scanner a= new Scanner(System.in);
                System.out.println("enter three number:  ");
                int j=a.nextInt();
		int k=a.nextInt();
		int l=a.nextInt();


  	   if(j<k && k<l)
		{
		System.out.println("numbers are in increasing order");
		}
	   else if(j>k && k>l)
		{
		System.out.println("numbers are in decreasing order");
		}
	   else
                {
		 System.out.println("nummbers are neither decreasing or increasing");
                }


            }
       }
/*
enter three number:  
3 4 5
numbers are in increasing order

enter three number:  
8 5 2
numbers are in decreasing order

enter three number:  
0 0 0
nummbers are neither decreasing or increasing
*/



