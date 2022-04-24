/*Write a menu driven program that would choose either in-built
method or call a user defined method to sort an array of strings*/


import java.util.*;

class Strsort{    //define
	void SortAndDisp(String arr[]){    //method for sorting and displaying array
			String temp;
			int len=arr.length;
			for(int i=0;i<len-1;i++){
				for(int j=i+1;j<len;j++){
					if(arr[i].compareTo(arr[j])> 0)     //compare all elements in the array
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0;i<len;i++){      //loop for displaying sorted array
			 System.out.print(arr[i]+"\t");
			}
			System.out.println();
	}
	String[] insert(String arr[],int len){         //method for reading elements to array
	for(int i=0;i<len;i++){
		arr[i]=System.console().readLine();
		
	}
	return arr;
	}
	
public static void main(String ar[]){ //main methord
	
		Strsort st =new Strsort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings you want: ");
		int num = sc.nextInt();
		String str[] = new String[num];		//initialize array
		System.out.println("Enter the elements in the array: ");
		str=st.insert(str,num);
		
		while(true){
				
				System.out.println("\n-------------------------------------");
				System.out.println("select your option\n1.array sort by user defined methord\n2.array sort by inbuild method\n3.exit...!");
				System.out.println("enter your option : ");
				int opt = sc.nextInt();
				
				System.out.println("-------------------------------------");
				if(opt==1){
						
				                     System.out.println("array sort by user defined method->");
					  st.SortAndDisp(str);	
				              }
				else if(opt == 2){
					System.out.println("array sort by inbuild method->");
					Arrays.sort(str);
					for(int i=0;i<num;i++){
						System.out.print(str[i]+"\t");
					             }
					System.out.println();
				}
				else{
					System.out.println("exiting...!");
					System.exit(0);
				}
		
		}
		
		
	
	}


}
/*
output	
Enter number of strings you want:
4
Enter the elements in the array:
thin
fat
short
tall

---------------------------------------
select your option
1.array sort by user defined methord
2.array sort by inbuild method
3.exit...!
enter your option :
1
-------------------------------------
array sort by user defined method->
fat     short   tall    thin

---------------------------------------
select your option
1.array sort by user defined methord
2.array sort by inbuild method
3.exit...!
enter your option :
2
-------------------------------------
array sort by inbuild method->
fat     short   tall    thin

---------------------------------------
select your option
1.array sort by user defined methord
2.array sort by inbuild method
3.exit...!
enter your option :
3
-------------------------------------
exiting...!
					
*/					
					