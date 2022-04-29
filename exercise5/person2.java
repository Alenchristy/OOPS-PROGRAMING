/*
2. Create a class ‘Person’ with data members Name, Gender, Address, Age and a
constructor to initialize the data members and another class ‘Employee’ that inherits
the properties of class Person and also contains its own data members like Empid,
Company_name, Qualification, Salary and its own constructor. Create another class
‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and also contain constructors and
methods to display the data members. Use array of objects to display details of N
teachers.
*/


import java.util.*;
class Person{         //creating class person
	String name;
	String gender;
	int age;
	String address;

	Person(String nam, String gen, int ag, String add){   //creating constructor for person
		name=nam;
		gender=gen;
		age=ag;
		address=add;

	}


}



class Employee extends Person{ //creating class employee inherit from person
	int empid;
	String company_name;
	String qualification;
	double salary;

	Employee(String nam, String gen, int ag, String add, int id, String cname, String qual, double sal){
		super(nam, gen, ag, add);
		empid=id;
		company_name=cname;
		qualification=qual;
		salary=sal;

	}
}


class Teacher extends Employee{ //creating class teacher inherit from employee
	String subject;
	String dptmnt;
	int teachid;

	Teacher(String nam, String gen, int ag, String add, int id, String cname, String qual, double sal, int tid, String dpt, String sub){
		super(nam, gen, ag, add, id, cname, qual, sal);
                subject=sub;
                dptmnt=dpt;
                teachid=tid;

	        }

void display(){    //method for display
	System.out.println("\nname: "+name+"\ngender: "+gender+"\nage: "+age+"\naddress: "+address);

	System.out.println("\nemploye id: "+empid+"\ncompany nmae: "+company_name+"\nqualification: "+qualification+"\nsalary: "+salary);

	System.out.println("\nteacher id: "+teachid+"\ndepartment: "+dptmnt+"\nsubject: "+subject);

           }


}


class main{      //creating main class 
	public static void main(String argd[]){
		Scanner obj=new Scanner(System.in);
		System.out.print("enter no. of teachers: ");
		int n=obj.nextInt();

		Teacher[] arr=new Teacher[n];

		for(int i=0;i<n;i++){
			System.out.println("enter the details of teacher "+(i+1));
			System.out.print("name: ");
			String nam=obj.next();

			System.out.print("gender: ");
            		String gen=obj.next();

          		System.out.print("age: ");
            		int ag=obj.nextInt();

            		System.out.print("address: ");
            		String add=obj.next();

            		System.out.print("employe id: ");
            		int id=obj.nextInt();

            		System.out.print("company name: ");
            		String cname=obj.next();
			
			System.out.print("qualification: ");
			String qual=obj.next();

            		System.out.print("salary: ");
            		double sal=obj.nextDouble();

            		System.out.print("teacher id: ");
            		int tid=obj.nextInt();

            		System.out.print("department: ");
            		String dpt=obj.next();

            		System.out.print("subject: ");
            		String sub=obj.next();

            		arr[i]=new Teacher(nam,gen,ag,add,id,cname,qual,sal,tid,dpt,sub);
            		//calling constructor of teacher and passing parameters
            		System.out.println("===========================\n");

            	}

            for(int x=0;x<n;x++){
            	System.out.println("--- Details of teacher "+(x+1)+" ---");
            	arr[x].display();

            }

	}


}

/*
Output

enter no. of teachers: 2
enter the details of teacher 1
name: malcom
gender: male
age: 29
address: abc
employe id: 101
company name: ibm   
qualification: mca
salary: 48000
teacher id: 1001
department: mca
subject: c++
===========================

enter the details of teacher 2
name: ann
gender: female
age: 30
address: xyz
employe id: 107
company name: amazon
qualification: mba
salary: 50000
teacher id: 1006
department: mba
subject: marketing
===========================

--- Details of teacher 1 ---

name: malcom
gender: male
age: 29
address: abc

employe id: 101
company nmae: ibm
qualification: mca
salary: 48000.0

teacher id: 1001
department: mca
subject: c++
--- Details of teacher 2 ---

name: ann
gender: female
age: 30
address: xyz

employe id: 107
company nmae: amazon
qualification: mba
salary: 50000.0

teacher id: 1006
department: mba
subject: marketing

*/
