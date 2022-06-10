/*
Program to demonstrate the working of Map interface
by adding, changing and removing elements.
*/

import java.util.*;
class Hashmap{
	public static void main(String ar[]){
	HashMap<Integer,String>hm=new HashMap<Integer,String>();
	//inserting the elements
	hm.put(1,"jawa");
	hm.put(2,"yezdi");
	hm.put(3,"bsa");
	hm.put(4,"goldstar");

	System.out.println("\nInitial map\n"+hm);

	hm.put(2,"perak");
	System.out.println("\nmap after changing an element\n"+hm);


	hm.remove(4);
	System.out.println("\nmap after removing an element\n"+hm);



	}
}


/* 
Output


Initial map
{1=jawa, 2=yezdi, 3=bsa, 4=goldstar}

map after changing an element
{1=jawa, 2=perak, 3=bsa, 4=goldstar}

map after removing an element
{1=jawa, 2=perak, 3=bsa}

*/
