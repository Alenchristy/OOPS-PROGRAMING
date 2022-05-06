package graphics;
import java.util.*;
interface Area{
void area(int s);
	}


public class Sq implements Area{
	
	
	public void area(int s){
		
		System.out.println("\narea of square: "+s*s);
		}
	}
