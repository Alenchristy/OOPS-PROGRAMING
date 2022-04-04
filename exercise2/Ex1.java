/*read 2 matrices from the user and perform matrix addition*/


import java.util.*;

class Ex1
     {
    public static void main(String args [])
       {
        Scanner obj=new Scanner(System.in);
	System.out.println("enter the number of rows: ");
	int row=obj.nextInt();
	System.out.println("enter the number of columns: ");
	int col=obj.nextInt();

	int array1[][]=new int[row][col];
	int array2[][]=new int[row][col];
	int result[][]=new int[row][col];


	System.out.println("enter the first matrix: ");
	for(int j=0;j<row;j++)
	{
	  for(int i=0;i<col;i++)
           {
	     array1[j][i]=obj.nextInt();
	   }
	}


	System.out.println("enter the second matrix: ");
	for(int j=0;j<row;j++)
	{
	  for(int i=0;i<col;i++)
           {
	     array2[j][i]=obj.nextInt();
	   }
	}

	System.out.println("your added matrix:");
	for(int j=0;j<row;j++)
	{
	  for(int i=0;i<col;i++)
           {
	     result[j][i]=array1[j][i]+array2[j][i];
	     System.out.print("\t"+result[j][i]);
	   }
	 System.out.println();	

	}



    }
 }



/*
enter the number of rows: 
4
enter the number of columns: 
4
enter the first matrix: 
3 4 5 6
4 5 6 7
1 2 3 8
8 6 4 2
enter the second matrix: 
4 6 7 3
3 2 4 5
4 5 6 7
4 6 2 4
your added matrix:
	7	10	12	9
	7	7	10	12
	5	7	9	15
	12	12	6	6
*/	
//Verified

















