/*
3. Program to remove an object from the Stack when the position is passed
as parameter
*/


import java.util.*;

class stak{
	public static void main(String ar[]){
		Stack<String>st=new Stack<String>();

		st.push("gallardo");
		st.push("italia");
		st.push("murcilago");
		st.push("agera");
		st.push("phantom");
		System.out.println("\nobjects in the stack are: "+st);
		

		st.removeElementAt(2);
		System.out.println("\nremoving object at position 2 from the stack using remove at: "+st);

		
		}
	}



/*
Output

objects in the stack are: [gallardo, italia, murcilago, agera, phantom]

removing object at position 2 from the stack using remove at: [gallardo, italia, agera, phantom]

*/
