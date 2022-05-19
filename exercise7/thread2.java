/*define classes one for generating fibonacci numbers and other for displaying even numbers in a given range implement using threads        (Runnable interface)
*/

import java.util.*;

class fibonacci implements Runnable{
		int n;
		fibonacci(int a){
			this.n=a;
		
		}
		
		public void run(){
			
			int a=0,b=1;
			try{if(n==1){
				System.out.println("\nfibonacci series \n -->0");
				
			}
			else{
				int f=0;
				System.out.println("\nfibonacci 0\n\nfibonacci 1");
				while(0<n-2){
					f=a+b;
					a=b;
					b=f;
					System.out.println("\nfibonacci "+f);
					n--;
					Thread.sleep(1000);
				}
				
			}	
		}
		catch(Exception e){
			System.out.println("something wrong");
		}
	}
}



class even implements Runnable{
	int e;
	even(int b){
	e=b;
	}

	public void run(){
	try{
	for(int i=1;i<=e;i++){
		if(i%2==0){
			System.out.println("\neven number - "+i);
			Thread.sleep(750);
			}
		}
	}
	catch(Exception e){
		System.out.println("something wrong");
		}

	}
}



class thread2{
	public static void main(String ar[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("enter a number: ");
		int k=ob.nextInt();

		fibonacci f=new fibonacci(k);
		Thread t=new Thread(f);

		even e=new even(2*k);
		Thread t1=new Thread(e);

		t.start();
		t1.start();


		}
}



/*
Output

enter a number: 9

fibonacci 0

fibonacci 1

fibonacci 1

even number - 2

even number - 4

fibonacci 2

even number - 6

fibonacci 3

even number - 8

fibonacci 5

even number - 10

even number - 12

fibonacci 8

even number - 14

fibonacci 13

even number - 16

fibonacci 21

even number - 18

*/
