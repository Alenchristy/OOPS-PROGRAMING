/*
2. Program to remove all the elements from a linked list
*/

import java.util.*;

class Linklist{
	public static void main(String arg[]){
		
		//creating a linked list
		LinkedList<String>l=new LinkedList<String>();


//add elements to the linked list
l.add("mvagusta");
l.add("maseratti");
l.add("norton");


//adding elements at first and last in the linked list
l.addLast("pagani");
l.addFirst("corvette");

System.out.println("contents of the linked list: "+l);


System.out.println("\ndeleting all elements from the linked list->");

l.clear();
System.out.println("\ncontents after deleting all elements in linked list: "+l);

			}
	}

/*
Output


contents of the linked list: [corvette, mvagusta, maseratti, norton, pagani]

deleting all elements from the linked list->

contents after deleting all elements in linked list: []

*/


