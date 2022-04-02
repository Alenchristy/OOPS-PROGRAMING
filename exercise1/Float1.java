/*program to read a floating point number and if the number is zero print zero otherwise print positive or negative add small if the absolute value of number is less than 1 or large if it exceeds 100000
*/




import java.util.Scanner;
	class Float{
           public static void main(String[] args) {
    Scanner m= new Scanner(System.in); 
    System.out.println("enter a floating point number:  ");

    float ft= m.nextFloat();
    
	
	if(ft==0)
             {
               System.out.println("it is zero");
	     }

	else if(ft>0)
	     {

		if(ft<1)
	            {
			System.out.println("The number is small positive!");
   		    }
		else if(ft>100000)
		    {
                         System.out.println("The number is large positive!");
                    }

		else
                    {
                         System.out.println("The number is positive!");
 		    }
	     }



   	else if(ft<0)
	     {
                
	     
		if(Math.abs(ft)<1)
	            {
			 System.out.println("small negative!");
   		    }

		else if(Math.abs(ft)>100000)
		    {
                         System.out.println("large negative!");
                    }

                else
                    {
                         System.out.println("The value is negative!");
                    }
            }


     }
}


/*
case1
enter a floating point number:  
-.32
small negative!
*/


/*
case2
enter a floating point number:  
.46
The number is small positive!
*/

/*
case3
enter a floating point number:  
150000
The number is large positive!
*/


/*
case4
enter a floating point number:  
-140400
large negative!
*/




