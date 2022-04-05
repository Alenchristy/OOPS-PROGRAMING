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

        for(int i=0;i<row;i++)
	{
	  for(int j=0;j<col;j++)
	  {
	    array1[i][j]=obj.nextInt();
	  }
	}




	for(int i=0;i<row;i++)
	{
	  for(int j=0;j<col;j++)
	  {
	    array2[i][j]=array1[j][i];
	  }
	}

       int same =0;
	for (int i=0;i<row;i++)
	{
	  for (int j=0;j<col;j++)
	   {
		if(array1[i][j]==array2[i][j])
                 {
                  same=1;
	         }
	    
                else{
		     same=0;
	             break;
                    }

    }

  }


if(same==1)
    {
	System.out.println("it is a symmetric matrix");
    }
else if(same==0)
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









