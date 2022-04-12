
/*Program to create a class for Employee having attributes eNo, eName
eSalary. Read n employ information and Search for an employee given
eNo, using the concept of Array of Objects*/



import java.util.*;
class search{

		int linear(int arr[],int item,int len){
		int j=0;
		while(j<len){
			if(arr[j]==item){
				return j;
			}
			j++;
		}
		return -1;
		
	
	
	}

}


class Employee{
	int eno;			//initialise variables
	String eName;
	double eSalary;
	
	
	void setData(int eno,String name,double salary){
			this.eno=eno;
			this.eName=name;      
			this.eSalary=salary;
	
	}
	void disp(){  //methord for display the details
			
			System.out.println("Employee no: "+eno+"\nEmployee Name: "+eName+"\nSalary:"+eSalary+"\n");
	
	}
	
	public static void main(String ar[]){
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the no.of employees:");
			int n=obj.nextInt();
			search s= new search();
			// Declaring an array of Employee
			Employee[] arr;
			arr=new Employee[n];// Allocating memory for n objects of type Employee
			int array[]=new int[n];
			for(int i=0;i<n;i++){
					System.out.println("Enter the details of "+(i+1)+"th employee");
					
					System.out.print("Enter employe no:");
					int en=obj.nextInt();
					
					System.out.print("\nEnter employe name:");
					String name=obj.next();
					
					System.out.print("\nEnter employe salary:");
					double sal=obj.nextDouble();
					
					arr[i]=new Employee();
					arr[i].setData(en,name,sal);
					array[i]=en;
					System.out.println("-----------------------\n");
					
			}
			
			
			
			do{
					System.out.println("\n1.Search \n2.exit");
					System.out.println("Select your option: ");
					int opt =obj.nextInt();
					
					System.out.println("-----------------------\n");
					
					switch(opt){
						case 1:System.out.println("Searching....!");
							   System.out.println("Enter the employe no to search:");
							   int emp_no=obj.nextInt();
							   int result= s.linear(array,emp_no,n);
							   if(result==-1)

							  {
							   System.out.println("no employee exists for this number");
							  }
								else{
										arr[result].disp();
				
								}
								System.out.println("-----------------------\n");
								break;

						case 2: System.out.println("Exiting....!");
								System.exit(0);
								break;
								
					
					
					}
					
					
			
			
			
			}while(true);
			
			
			
	}

}
/* output

Enter the no.of employees:
3
Enter the details of 1th employee
Enter employe no:1

Enter employe name:sam

Enter employe salary:30000
-----------------------

Enter the details of 2th employee
Enter employe no:2

Enter employe name:john

Enter employe salary:20000
-----------------------

Enter the details of 3th employee
Enter employe no:3

Enter employe name:malcom

Enter employe salary:25000
-----------------------


1.Search 
2.exit
Select your option: 
1
-----------------------

Searching....!
Enter the employe no to search:
2
Employee no: 2
Employee Name: john
Salary:20000.0

-----------------------


1.Search 
2.exit
Select your option: 
1
-----------------------

Searching....!
Enter the employe no to search:
3
Employee no: 3
Employee Name: malcom
Salary:25000.0

-----------------------

1.Search 
2.exit
Select your option: 
2
-----------------------

Exiting....!


*/
