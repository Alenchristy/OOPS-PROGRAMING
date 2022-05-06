package arithmetic;

interface Division{
	void result(int a,int b);
	}

public class Div implements Division{
	double r=0;
	
	public void result(int a,int b){
		r=(double)a/b;
		System.out.println("result: "+r);
}
}
