package graphics;
import java.util.*;


interface Area{
void area(int r);
	}


public class Cir implements Area{
	
	double pi=3.14;

	public void area(int r){
		
		System.out.println("\narea of circle: "+pi*r*r);
		}
	}
