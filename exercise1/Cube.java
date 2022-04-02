/*program to display the cube of the number upto a given integer*/


import java.util.Scanner;
	class Cube{

           public static void main(String[] args)
      {
              Scanner a= new Scanner(System.in);
              System.out.println("enter an integer number:  ");

              int cn=a.nextInt();
		System.out.println("the cube of number are: ");
              for(int i=1; i<=cn;i++)
   		{
                   int c=i*i*i;
                
                   System.out.println("the cube of "+i+ " is "+c);
                }
		
      }
}           


/*
enter an integer number:  
5
the cube of number are: 
the cube of 1 is 1
the cube of 2 is 8
the cube of 3 is 27
the cube of 4 is 64
the cube of 5 is 125

*/
