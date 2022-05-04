import java.util.*;

interface BillGen{
	void calculate();
}


class ProductB{
	String name;
	int prod_id;
	int quantity;
	int unit_price;
	int total;
	double dis;

	ProductB(String n,int p,int q,int u){
		name=n;
		prod_id=p;
		quantity=q;
		unit_price=u;
	}
	public void Calculate(){
		total=quantity*unit_price;
		dis=total*0.1;
		System.out.println("\n"+prod_id+"\t\t"+name+"\t\t" +quantity+"\t\t"+unit_price+"\t\t"+total+"\t"+dis);

	}
}


class Bill{
	public static void main (String arg[]){
		Scanner s=new Scanner(System.in);

		System.out.print("enter date: ");
		String date=s.next();

		System.out.print("order no: ");
		int order=s.nextInt();

		System.out.print("number of products: ");
		int n=s.nextInt();

		ProductB[] ar=new ProductB[n];
		for(int p=0;p<n;p++){
			System.out.print("\nenter details for product "+(p+1));

			System.out.print("\nproduct name: ");
			String nam=s.next();

			System.out.print("product id: ");
			int id=s.nextInt();

			System.out.print("quantity: ");
			int q=s.nextInt();

			System.out.print("unit price: ");
			int pr=s.nextInt();

			ar[p]=new ProductB(nam,id,q,pr);
		}
        
        System.out.println("=====================================================================");
        System.out.println("\t\t\t        Bill");
		System.out.println("order no: "+order);

		System.out.println("date: "+date);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("product id \tname \t\tquantity \tunit price \ttotal \tdiscount");
		System.out.println("---------------------------------------------------------------------");	
		int a=0;
		for(int e=0;e<n;e++){
			ar[e].Calculate();
			a=a+ar[e].total;
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("net amount: "+a);
		System.out.println("");




		
	}
}

