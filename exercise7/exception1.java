/*1. Write a user defined exception class to authenticate
the user name and password.*/

import java.util.*;

class Exception1 extends Exception{
	public Exception1(String s){
		super(s);
	    }
	}


class main{
	public static void main(String ar[]){
		String username="alen0201";
		String password="mrx";
		
		Scanner obj=new Scanner(System.in);

		System.out.print("enter username: ");
		String n=obj.next();
		System.out.print("enter password: ");
		String p=obj.next();

		try{
			if((n.equals(username)) && (p.equals(password))){
				System.out.println("\nauthentication successful \naccess granted");
				}
			else{
				throw new Exception1("\nauthentication failed !!! \naccess denied");
				}
			}

		catch(Exception1 ab){
			System.out.println(ab.getMessage() +"\n");
			}
		}
	}

/*
Output

enter username: alen0201
enter password: mrx

authentication successful 
access granted

enter username: asdad
enter password: 41223

authentication failed !!! 
access denied

*/
