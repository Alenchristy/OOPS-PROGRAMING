/*

Create CPU with attribute price. Create inner class
Processor (no. of cores, manufacturer)and static nested class
RAM (memory, manufacturer). Create an object of CPU and
print information of Processor and RAM.
*/

class Cpu{
	double price=14500;
		void display(){
			        System.out.println("CPU details\n---------------\nprice=> "+price);
		      	        
			        Processor p=new Processor();
			        Ram r=new Ram();
			}

			class Processor{
				String cores="octa core";
				String manufacturer="intel";
				Processor(){
					  System.out.println("\nprocessor");
					  System.out.println("no. of cores=> "+cores+"\nmanufacture=> "+manufacturer);
					}

			}
			class Ram{
				int memory=16;
				String manufacturer="crucial";
				Ram(){
					System.out.println("\nram");
					System.out.println("memory=> "+memory+"\nmanufacturer=> "+manufacturer);

				}

			}

		public static void main(String arg[]){
				Cpu cpu=new Cpu();
				cpu.display();
				}

	}


/*
Output

CPU details
---------------
price=> 14500.0

processor
no. of cores=> octa core
manufacture=> intel

ram
memory=> 16
manufacturer=> crucial

*/