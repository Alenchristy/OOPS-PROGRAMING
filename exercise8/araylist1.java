/*
Maintain a list of Strings using ArrayList from collection
framework, perform built-in operations.
*/


import java.util.*;

class araylist{
	public static void main(String ar[]){

		ArrayList<String>a=new ArrayList<String>();

		System.out.println("initial size of araylist: "+a.size());
		
		a.add("lamborghini");
		a.add("huracan");
		a.add("aventador");
		a.add("countach");

		System.out.println("aray list: "+a);
		System.out.println("size of araylist: "+a.size());
		
		System.out.println("\nadding new element at index position one");
		a.add(1,"murcilago");
		System.out.println("aray list: "+a);
		System.out.println("size of araylist: "+a.size());

		System.out.println("\nremoving element from list");
		a.remove("countach");
		
		System.out.println("aray list: "+a);
		System.out.println("size of araylist: "+a.size());

		System.out.println("\nremoving element from list by index position");
		a.remove(1);
		System.out.println("aray list: "+a);
		System.out.println("size of araylist: "+a.size());


		}

	}

/*

Output

initial size of araylist: 0
aray list: [lamborghini, huracan, aventador, countach]
size of araylist: 4

adding new element at index position one
aray list: [lamborghini, murcilago, huracan, aventador, countach]
size of araylist: 5

removing element from list
aray list: [lamborghini, murcilago, huracan, aventador]
size of araylist: 4

removing element from list by index position
aray list: [lamborghini, huracan, aventador]
size of araylist: 3

*/
