package arithmetic;

interface Division{
	void result(int a,int b);
	}

public class Div implements Division{
	
	public void result(int a,int b){
		System.out.println("result: "+(a/b));
}
}
