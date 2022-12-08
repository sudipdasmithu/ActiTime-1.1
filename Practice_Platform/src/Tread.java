
public class Tread {
	void printTable(int n)
	{//method not synchronized  
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }
		     catch(Exception e)
		     {
		    	 System.out.println(e);
		     }  
		   }  
		  
		 }  
		}
class  MyThread1 extends Thread{
	Tread t;
	MyThread1 (Tread t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread{
	Tread t;
	public MyThread2(Tread t) {
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}
class TestSync {
	public static void main (String args []) {
	Tread obj= new Tread();
	MyThread1 t1= new MyThread1(obj);
	MyThread2 t2= new MyThread2(obj);
	t1.start();
	t2.start();
	
}
}
