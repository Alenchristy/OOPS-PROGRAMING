package arithmetic;

interface Subtraction{
	void result(int a,int b);
	}

public class Sub implements Subtraction{
	
	public void result(int a,int b){
		System.out.println("result: "+(a-b));
}
}
