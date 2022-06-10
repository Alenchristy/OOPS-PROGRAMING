/*program to convert hashmap to treemap
*/


import java.util.*;
class treemap{
	public static void main(String ar[]){
	HashMap<String, Integer>hm=new HashMap<String, Integer>();
	//inserting the elements
	hm.put("jawa",3);
	hm.put("yezdi",4);
	hm.put("bsa",2);
	hm.put("goldstar",1);

	System.out.println("\nhash map\n"+hm);

	TreeMap<String, Integer>tm=new TreeMap<String, Integer>();
	tm.putAll(hm);

	System.out.print("\ntree map after convertion from hashset\n"+tm+"\n");



	}
}

/*
Output

hash map
{jawa=3, bsa=2, yezdi=4, goldstar=1}

tree map after convertion from hashset
{bsa=2, goldstar=1, jawa=3, yezdi=4}

*/
