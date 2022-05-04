/*
Prepare bill with the given format using
calculate method from interface.

*/


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

	ProductB(String n,int p,int q,int u){
		name=n;
		prod_id=p;
		quantity=q;
		unit_price=u;
	}
	public void Calculate(){
		total=quantity*unit_price;
		System.out.println("\n"+prod_id+"\t\t"+name+"\t\t" +quantity+"\t\t"+unit_price+"\t\t"+total);

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
		System.out.println("product id \tname \t\tquantity \tunit price \ttotal");
		System.out.println("---------------------------------------------------------------------");	
		int a=0;
		for(int e=0;e<n;e++){
			ar[e].Calculate();
			a=a+ar[e].total;
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("net amount: "+a);




		
	}
}


/*
Output


enter date: 04/02/2022
order no: 24
number of products: 3
enter details for product 1
product name: book
product id: 113
quantity: 7
unit price: 40

enter details for product 2
product name: pen
product id: 118
quantity: 4
unit price: 15
enter details for product 3
product name: biscuit
product id: 312
quantity: 5
unit price: 35
=====================================================================
                                Bill
order no: 24
date: 04/02/2022
---------------------------------------------------------------------
product id      name            quantity        unit price      total
---------------------------------------------------------------------
113             book            7               40              280
118             pen             4               15              60
312             biscuit         5               35              175
---------------------------------------------------------------------
net amount: 515


*/


