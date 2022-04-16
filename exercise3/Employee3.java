/*
Q3,program to create a class employee having attributes eno,ename,esalary,Read n employee information 
and search for an employee given eno,using the concept of array of objects
*/


import java.util.*;
class emp{
	int eno,esal;
	String ename;
	void setdata(int a, String b, int c)//to initialise variables
	  {
	   eno=a;
	   ename=b;
	   esal=c;
	  }
	}

class Employee3{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("enter number of employees: ");
	int n=s.nextInt();

	emp obj[]=new emp[n];//declaring an array of objects
	for(int j=0;j<n;j++)
	obj[j]=new emp();
	int a,f=0;
	String b;
	int c,i;

	for(i=0;i<n;i++)
	{
	System.out.println("-------------------------------------");
	System.out.println("details of employee "+(i+1)+"->\nenter employee number, name, salary->");
	
	a=s.nextInt();
	b=s.next();
	c=s.nextInt();
	obj[i].setdata(a,b,c);//calling setdata method to initialize
	}
	System.out.println("-------------------------------------");
	System.out.println("enter employee id to search: ");
	int id=s.nextInt();
	for(i=0;i<n;i++)
	{
	 if(id==obj[i].eno)//comparing id
		{
		 System.out.println("employee exists in the list");
		 f=1;
		 break;
		}
	 }
	if(f==0)
	System.out.println("employee not found!!!");
	}
    }


/*
Output
enter number of employees: 3
-------------------------------------
details of employee 1->
enter employee number, name, salary->
101 sam 35000
-------------------------------------
details of employee 2->
enter employee number, name, salary->
102 malcom 26000
-------------------------------------
details of employee 3->
enter employee number, name, salary->
103 raghav 29000
-------------------------------------
enter employee id to search:
102
employee exists in the list
-------------------------------------
enter employee id to search:
104
employee not found!!!

*/