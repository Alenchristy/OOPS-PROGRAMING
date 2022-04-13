/*
3)
Write a program to illustrate the following String manipulation methods.

1. Create new strings using new.
2. Getting String length
3. String Concatenation
4. Character extraction
5. String Comparison
6. Searching substrings
7. Modifying a string
8. Data conversion using valueOf()

*/


class Strmanipulation{
	public static void main(String args[]){

		//new string using new
		char chs[] = {'w','e','l','c','o','m','e'};
		String newStr = new String(chs);
		System.out.println("new string from char[] using new string: " +newStr);

		byte asciis[] = {65,66,67,68,69,70};
		newStr = new String(asciis);
		System.out.println("new string from byte[] using new String: "+newStr);


		String s1 = "good";
		String s2 = "morning";
		//string length
		System.out.println("string length of 'good' : "+s1.length());
		
		//to uppercase and lowercase
		System.out.print("\n");
		System.out.println("case changing:-");
		System.out.println(s1 +" to uppercase: "+ s1.toUpperCase());
		System.out.println(s2 +" to lowercase: " + s2.toLowerCase());



		//concatenation
		System.out.print("\n");
		System.out.println("concatination:-");
		System.out.println("using concat(): "+ s1.concat(s2));
		System.out.println("using + operator: "+ s1 + s2);


		//character extraction
		System.out.print("\n");
		System.out.println(" character extraction:-");
		System.out.println(" char @ 3rd position: "+ s1.charAt(3));
		char c[] = new char[5];
		s1.getChars(2,4,c,0);
		System.out.println(" char between 2 & 4: "+ new String(c));



		System.out.print("\n");
		System.out.println("character comparison:- ");
		s1 = "welcome";
		s2 = "WELCOME";
		System.out.println(s1 + " equals " + s2 +" : " + s1.equals(s2));
		System.out.println(s1 + " equalsignorecase" + s2 +":" + s1.equalsIgnoreCase(s2));

		System.out.println(s1 + " compare to" + s2 + " : " + s1.compareTo(s2));
		System.out.println(s1 + " comparetoignorecase" + s2 + " : " + s1.compareToIgnoreCase(s2));

		System.out.println(s1 + " startswith w : " +s1.startsWith("w"));
		System.out.println(s1 +" endswith x: " +s1.endsWith("x"));


		System.out.print("\n");
		System.out.println("search substring:- ");
		s1="Hello siri what is the time";
		System.out.println(s1 +" index of (what): " +s1.indexOf("what"));
		System.out.println(s1 +" last index of(what): " +s1.lastIndexOf("what"));


		System.out.print("\n");
		System.out.println("modyfying string:- ");
		s1="welcome to java";
		System.out.println(s1 + "replace java to html "+ s1.replace("java","html"));

		System.out.print("\n");
		System.out.println("data convertion using valueOf():- ");
		int j=7;
		String a="77";
		System.out.println(j + " convert using data conertion using valueOf(): " +String.valueOf(j));
		
		System.out.println("concat with string: " +a + String.valueOf(j));


     
   }
}

/*
1)
new string from char[] using new string: welcome
new string from byte[] using new String: ABCDEF
string length of 'good' : 4
-------------------------------

2)
case changing:-
good to uppercase: GOOD
morning to lowercase: morning
-------------------------------

3)
concatination:-
using concat(): goodmorning
using + operator: goodmorning
------------------------------

4)
character extraction:-
char @ 3rd position: d
char between 2 & 4: od
-----------------------------

5)
character comparison:- 
welcome equals WELCOME : false
welcome equalsignorecaseWELCOME:true
welcome compare toWELCOME : 32
welcome comparetoignorecaseWELCOME : 0
welcome startswith w : true
welcome endswith x: false
--------------------------

6)
search substring:- 
Hello siri what is the time index of (what): 11
Hello siri what is the time last index of(what): 11
----------------------------

7)
modyfying string:- 
welcome to javareplace java to html welcome to html
----------------------------

8)
data convertion using valueOf():- 
7 convert using data conertion using valueOf(): 7
concat with string: 777



*/
