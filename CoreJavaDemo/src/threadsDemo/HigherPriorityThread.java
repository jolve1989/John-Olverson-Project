package threadsDemo;

public class HigherPriorityThread implements Runnable{
	
	int counter;
	Thread myThread;
		
	public HigherPriorityThread() {
		
		myThread = new Thread(this);
	}
   public void run() {
	   
	   while(true) {
		   counter++;
	   }
		
	}
	


	   
	 
   }

