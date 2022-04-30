/*
Create a class ‘Employee’ with data members Empid,
Name, Salary, Address and constructors to initialize the
data members. Create another class ‘Teacher’ that inherit
the properties of class employee and contain its own data
members department, Subjects taught and constructors
to initialize these data members and also include display
function to display all the data members. Use array of
objects to display details of N teachers.
*/


import java.util.*;
class Employee{
	int empid;
	String name;
	double salary;
	String address;

	void Employee(int eid, String nam, double sal, String add){
		empid=eid;
		name=nam;
		salary=sal;
		address=add;

		}
	}

class Teacher extends Employee{
	String department;
	String subjects_taught;

	Teacher(String dpt, String sub, int eid, String nam, double sal, String add){
		department=dpt;
		subjects_taught=sub;
		empid=eid;
		name=nam;
		salary=sal;
		address=add;
		}

	void display(){
		System.out.println("employee id:- "+empid+"\nemployee name:- "+name+"\nsalary:- "+salary+"\naddress:-   "+address+"\ndepartment:- "+department+"\nsubjects taught:- "+subjects_taught);
			}
		}


class main{      //main class
public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	System.out.println("enter no. of teachers: ");
	int m=obj.nextInt();

	Teacher [] arr;        //declaring an array 
	arr=new Teacher[m];    //allocating memory
	int array[]=new int[m];


	for(int j=0;j<m;j++)
	{
	System.out.println("enter the details of "+(j+1)+"th teacher ");
	System.out.println("-------------------------------");

	System.out.println("employee id: ");
	int eid=obj.nextInt();

	System.out.println("employee name: ");
	String nam=obj.next();

	System.out.println("employee salary: ");
	int sal=obj.nextInt();

	System.out.println("employee address: ");
	String add=obj.next();

	System.out.println("employee department: ");
	String dpt=obj.next();

	System.out.println("subjects taught: ");
	String sub=obj.next();

	arr[j]=new Teacher(dpt,sub,eid,nam,sal,add);

	System.out.println("===================================");
	}


for(int i=0;i<m;i++){
	System.out.println("--Details of teacher"+(i+1)+"--");
	System.out.println("```````````````````````");
	arr[i].display();
	}

	}
   }

/*

Output

enter no. of teachers: 
3
enter the details of 1th teacher 
-------------------------------
employee id: 
101
employee name: 
malcom
employee salary: 
56000
employee address: 
green villa(h)
employee department: 
subjects taught: 
java
===================================
enter the details of 2th teacher 
-------------------------------
employee id: 
102
employee name: 
arnold
employee salary: 
60000
employee address: 
mount villa(h)
employee department: 
subjects taught: 
c++
===================================
enter the details of 3th teacher 
-------------------------------
employee id: 
103
employee name: 
jane
employee salary: 
65000
employee address: 
silver clouds(h)
employee department: 
subjects taught: 
python
===================================
--Details of teacher1--
```````````````````````
employee id:- 101
employee name:- malcom
salary:- 56000.0
address:-   green
department:- villa(h)
subjects taught:- java
--Details of teacher2--
```````````````````````
employee id:- 102
employee name:- arnold
salary:- 60000.0
address:-   mount
department:- villa(h)
subjects taught:- c++
--Details of teacher3--
```````````````````````
employee id:- 103
employee name:- jane
salary:- 65000.0
address:-   silver
department:- clouds(h)
subjects taught:- python

*/


