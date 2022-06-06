/*
6. program to demonstrate the creation of set object using the linkedhashset class
*/

import java.util.*;

class hashset{
	public static void main(String ar[]){

	LinkedHashSet<String>lhs=new LinkedHashSet<String>();

	lhs.add("ford");
	lhs.add("ktm");
	lhs.add("hyundai");
	lhs.add("honda");
	lhs.add("triumph");

	System.out.println("contents in the linked hash set: "+lhs);

	}
}


/*
Output

contents in the linked hash set: [ford, ktm, hyundai, honda, triumph]

*/
