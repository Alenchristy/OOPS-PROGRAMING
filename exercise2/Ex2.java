/*read a matrix from the console and check whether it is symmetric or not*/

import java.util.*;

class Ex2
     {
    public static void main(String args [])
       {
        Scanner obj=new Scanner(System.in);
	System.out.println("enter the number of rows: ");
	int row=obj.nextInt();
	System.out.println("enter the number of columns: ");
	int col=obj.nextInt();

	int array[][]=new int[row][col];
	
	boolean symmetric = false;
	System.out.println("enter the elements of the matrix: ");

        for(int i=0;i<row;i++)
	{
	  for(int j=0;j<col;j++)
	  {
	    array[i][j]=obj.nextInt();
	  }
	}




	for(int i=0;i<row;i++)
	{
	  for(int j=0;j<col;j++)
 	  {
	  
	   if ( array[i][j]==array[j][i])
	     {
		symmetric =true;
	        
	     }

           else{
		symmetric=false;
                break;
               }

	  }
       }
       

   


if(symmetric)
    {
	System.out.println("it is  a symmetric matrix");
    }

else
    {
	System.out.println("it is not a symmetric matrix");
    }


   }

 }

/*
output


enter the number of rows: 
4
enter the number of columns: 
4
enter the elements of the matrix: 
1 2 3 4
6 7 4 5
3 5 7 2
7 3 5 9
it is not a symmetric matrix


enter the number of rows: 
2
enter the number of columns: 
2
enter the elements of the matrix: 
3 4
4 3
it is a symmetric matrix

*/









