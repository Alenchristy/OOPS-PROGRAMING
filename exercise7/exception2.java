/*
find the average of n positive integers, raising a user defined exception for each negative input
*/

import java.util.*;

class exception extends Exception{
	public exception(String a){
		super(a);
		}
	}


class main{
	public static void main(String ar[]){
		Scanner obj=new Scanner(System.in);
		System.out.print("enter n.o of items: ");
		int n=obj.nextInt();

		int d;
		int total=0;
		int c=0;
		System.out.println("enter numbers: ");
		for(int j=0;j<n;j++){
			d=obj.nextInt();
			try{
				if(d>=0){
					c++;
					total=total+d;
					}
	
				else{
					throw new exception("\nnumber"+d+" is -ve, \nenter a +ve number: ");
					
					}
			}
	
			catch(exception ac){
				System.out.print(ac.getMessage()+"\n");
					}

			if(d<0){
				j=j-1;
				}


				}
				System.out.println("avg of "+c+" positive no = "+(double)total/c);
				}
			}
/*
Output

enter n.o of items: 5
enter numbers: 
3 
5
-7
number-7 is -ve, 
enter a +ve number: 
6
8
-2
number-2 is -ve, 
enter a +ve number: 
9
avg of 5 positive no = 6.2


*/
