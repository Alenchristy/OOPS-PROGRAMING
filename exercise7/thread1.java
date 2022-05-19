/*define 2 classes one for generating multiplication table of 5 and other for displaying first N prime numbers. implement using threads
*/

import java.util.*;

class mul extends Thread{

	public void run(){
		super.run();
	

	try{
	for(int j=1;j<=10;j++){
		System.out.println("5 x "+j+" = "+5*j+"\n");
		Thread.sleep(900);
	    }
	}
	catch (Exception e){
		System.out.println("thread interrupted");
	
	        }
	    }
	}



class prim extends Thread{
	int m;
	prim(int i){  //creating constructor
		m=i;
	}


	public void run(){
		super.run();

		boolean x;
	
	try{
		for(int i=2;i<m;i++){
					x=true;
				for(int j=2;j<=i/2;j++){
							
					if(i%j==0){
						x=false;
						
					}
				}
				if(x){
				System.out.println("prime - "+i+"\n");
				}

				Thread.sleep(100);
			}
			}

	catch (Exception e){
		System.out.println("thread interrupted");
	}

	
	}
}
	
	
class thread{     //creating main class
	public static void main(String ar[]){

		Scanner ob= new Scanner(System.in);
		
		System.out.print("enter the limit for prime number: ");
		int k=ob.nextInt();
		System.out.println("\n");
		
				mul m=new mul();
				prim p=new prim(k);

			
				   m.start();
				   p.start();
		

	}
}




/*
Output
enter the limit for prime number: 20
prime - 2
5 x 1 = 5
prime - 3
prime - 5
prime - 7
5 x 2 = 10
prime - 11
prime - 13
prime - 17
5 x 3 = 15
prime - 19
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
*/
