package arithmetic;

interface Addition{
	void result(int a,int b);
	}

public class Add implements Addition{
	
	public void result(int a,int b){
		System.out.println("result: "+(a+b));
}
}
