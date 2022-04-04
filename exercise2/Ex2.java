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

	int array1[][]=new int[row][col];
	int array2[][]=new int[row][col];

	System.out.println("enter the elements of the matrix: ");

        for(int i=0;i<col;i++)
	{
	  for(int j=0;j<row;j++)
	  {
	    array1[i][j]=obj.nextInt();
	  }
	}




	for(int i=0;i<col;i++)
	{
	  for(int j=0;j<row;j++)
	  {
	    array2[i][j]=array1[j][i];
	  }
	}

   if(Arrays.deepEquals(array1, array2))
     {
       System.out.println("the matrix is symmetric ");
     }

   else
      { System.out.println("the matrix is not symmetric ");

      }



    }

  }








/*
enter the number of rows: 
2
enter the number of columns: 
2
enter the elements of the matrix: 
2 4
4 5 
the matrix is symmetric 

enter the number of rows: 
4
enter the number of columns: 
4
enter the elements of the matrix: 
3 4 5 6
4 5 6 7
1 2 7 6 
7 6 4 3
the matrix is not symmetric 

*/

//Don't use Arrays.deepEquals.....find it by comparing the elements
