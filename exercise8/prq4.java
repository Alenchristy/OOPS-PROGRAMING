/*
4. Program to demonstrate the creation of queue object using the
PriorityQueue class

*/

import java.util.*;

class priortyq{
	public static void main(String ar[]){
		PriorityQueue<String>q=new PriorityQueue<String>();
		q.add("anderson");
		q.add("maverick");
		q.add("valentina rossi");
		q.add("joan mir");
		q.add("mar marcus");
	
		System.out.println("\ncontents printing using iterator\n");
		Iterator<String>itr=q.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			}
		}
	}
	

/*
Output

contents printing using iterator

anderson
joan mir
valentina rossi
maverick
mar marcus

*/
