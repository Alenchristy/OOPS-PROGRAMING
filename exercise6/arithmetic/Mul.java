package arithmetic;

interface Multiply{
	void result(int a,int b);
	}

public class Mul implements Multiply{
	
	public void result(int a,int b){
		System.out.println("result: "+(a*b));
}
}
