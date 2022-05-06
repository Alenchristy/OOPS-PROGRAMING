package graphics;
import java.util.*;


interface Area{
void area(int b,int h);
	}


public class Tr implements Area{
	


	public void area(int b,int h){
		
		System.out.println("\narea of triangle: "+0.5*b*h);
		}
	}
