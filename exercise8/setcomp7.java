/*
write a program to compare two hash set
*/

import java.util.*;

class setcomp{
	public static void main(String ar []){
	
	//create a empty hash set
	HashSet<String>hs1=new HashSet<String>();
	hs1.add("red");
	hs1.add("black");
	hs1.add("green");
	hs1.add("yellow");
	hs1.add("violet");
	hs1.add("pink");

	System.out.println("\nelements in the hashset1: "+hs1);

	HashSet<String>hs2=new HashSet<String>();
	hs2.add("orange");
	hs2.add("blue");
	hs2.add("violet");
	hs2.add("red");
	hs2.add("green");

	System.out.println("\nelements in the hashset2: "+hs2);
	System.out.println("\ncomparing two hashsets hs1 & hs2");
	System.out.println("--------------------------------");

	/*for(String element:hs1){
		
		if(hs2.contains(element)){
			System.out.println("\nboth hashsets have element "+element);
			}
		else{
			System.out.println("\nelement "+element+" is only in one hashset");
			}
		}*/

	
		System.out.println("hashset comparison is-> "+hs1.equals(hs2));
		

	
	}
}


/*
Output

elements in the hashset1: [red, pink, green, black, yellow, violet]

elements in the hashset2: [orange, red, green, blue, violet]

comparing two hashsets hs1 & hs2
--------------------------------
hashset comparison is-> false


*/
