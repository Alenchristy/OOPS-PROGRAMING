/* 5. Producer/Consumer using ITC
*/

class Q{
	int n;
	boolean valueSet=false;
	
	synchronized int get(){
		while(!valueSet)
		try{
			wait();
		}
		catch(InterruptedException e)
		{
		System.out.println("interupted exception");
		}
		
		System.out.println("got: "+n);
		valueSet=false;
		notify();
		return n;
		}

	synchronized void put(int n){
		while(valueSet)
		try{
			wait();
		}
		catch(InterruptedException e)
		{
		System.out.println("interupted exception");
		}

		this.n=n;
		valueSet=true;
		System.out.println("put: "+n);
		notify();
		}
	}



class producer implements Runnable{
	Q q;
	Thread t;

	producer(Q q){
	this.q=q;
	t=new Thread(this,"producer");
	}

	public void run(){
		int i=0;
		while(true){
			q.put(i++);
			}
		}
	}


class consumer implements Runnable{
	Q q;
	Thread t;

	consumer(Q q){
		this.q=q;
		t=new Thread(this,"consumer");
		}

		public void run(){
			while(true){
				q.get();
				}
			}
		}

class prodcons{
	public static void main(String ar[]){
	Q q=new Q();
	producer p=new producer(q);
	consumer c=new consumer(q);

	//start the thread
	p.t.start();
	c.t.start();

	System.out.println("control + c to stop");
	}
}


/*
Output

control + c to stop
put: 0
got: 0
put: 1
got: 1
put: 2
got: 2
put: 3
got: 3
put: 4
got: 4
put: 5
got: 5
put: 6
got: 6
put: 7
got: 7
put: 8
got: 8
put: 9
got: 9

*/

		 
