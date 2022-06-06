/*
5. Program to demonstrate the addition and deletion of elements in deque
*/

import java.util.*;

class deque{
	public static void main(String ar[]){
	
	Deque<String>dq=new ArrayDeque<String>();
	dq.add("xy");
	dq.add("bb");
	dq.add("cs");
	dq.add("xb");
	dq.add("mc");
	dq.add("yz");

	System.out.println("\nelements after addition: "+dq);

	dq.pop();
	System.out.println("\ndeleting element using pop(): "+dq);

	dq.remove("bb");
	dq.remove("mc");
	System.out.println("\nelements after deleting bb & mc: "+dq);
	}
}


/*
Output

elements after addition: [xy, bb, cs, xb, mc, yz]

deleting element using pop(): [bb, cs, xb, mc, yz]

elements after deleting bb & mc: [cs, xb, yz]


*/
