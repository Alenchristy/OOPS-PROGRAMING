/*1. Program to create a generic stack and do the Push and Pop
operations.
*/

import java.util.*;
class StackOperations<T>{
	
	//Scanner sc=new Scanner(System.in);

	void push(ArrayList<T> arr,T item){
		
		
		//T item=System.console().readLine();
		arr.add(item);
	
	}
	void pop(ArrayList<T> arr){
		if(arr.isEmpty()){
			System.out.println("Stack is Empty");
		}
		else{
		
		int index = arr.size()-1;
		System.out.println("poped item is : "+arr.get(index));
		arr.remove(index);
		}
	}
	void Display(ArrayList<T> arr){
			System.out.println("elements in stack");
		for(T elements :arr){
			System.out.print(elements+"\t");
		}
	
	}
	

}

class stack{
	public static void main(String ar[]){
		StackOperations s=new StackOperations();
		Scanner sc=new Scanner(System.in);
		ArrayList<String> sr=new ArrayList<String>();
		ArrayList<Integer> AI=new ArrayList<Integer>();
		
		
		
		
		/*System.out.println("\n1.String\n2.Integer\n");
		System.out.println("\nplease select your choice");
		int opt = sc.nextInt();*/
		
		System.out.println("-------------------------------");
		
		while(true){
				System.out.println("\n1.push\n2.pop\n3.Disp\n4.exit");
				System.out.println("\nplease select your choice");
				int ch=sc.nextInt();
				System.out.println("-------------------------------");
				
				switch(ch){
					case 1:	
							System.out.println("Enter the item to push");
							String item=System.console().readLine();
							s.push(sr,item);
							break;
					case 2:
							s.pop(sr);
							
							break;
					case 3: 
							s.Display(sr);
							break;
					default:
							System.exit(0);				
				}

		}
		
			
		
	
	}
}


/*
Output


-------------------------------

1.push
2.pop
3.Disp
4.exit

please select your choice
1
-------------------------------
Enter the item to push
23

1.push
2.pop
3.Disp
4.exit

please select your choice
1
-------------------------------
Enter the item to push
567

1.push
2.pop
3.Disp
4.exit

please select your choice
3
-------------------------------
elements in stack
23	567	
1.push
2.pop
3.Disp
4.exit

please select your choice
2
-------------------------------
poped item is : 567

1.push
2.pop
3.Disp
4.exit

please select your choice
1
-------------------------------
Enter the item to push
346

1.push
2.pop
3.Disp
4.exit

please select your choice
2
-------------------------------
poped item is : 346

1.push
2.pop
3.Disp
4.exit

please select your choice
2
-------------------------------
poped item is : 23

1.push
2.pop
3.Disp
4.exit

please select your choice
2
-------------------------------
Stack is Empty

1.push
2.pop
3.Disp
4.exit

please select your choice
4
-------------------------------


*/
