package threadsDemo;

public class MainThreadDemo {

	public MainThreadDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread mainThread = Thread.currentThread();
		System.out.println("Thread Name:" + mainThread.getName());
		System.out.println("Priority:" + mainThread.getPriority());
		System.out.println("State of the thread:"+ mainThread.getState());
		System.out.println("Thread group:" + mainThread.getThreadGroup());
		System.out.println("Is the thread alive? : " + mainThread.isAlive());
		
		
		//here we have created a child thread at java level,not a OS level
		ChildThread ct1 = new ChildThread("MyChildThreadOne");
		ChildThread ct2 = new ChildThread("MyChildThreadOne");
		
		SecondChildThread sct1 = new SecondChildThread("MyChildThreadThree");
		// this is when we tell the OS that a child thread should be
					// created at OS level. Only when we call the start() method the child thread spawns
					// from the parent thread 
				// this method will also implicitly call the run method
		ct1.start();
		ct2.start();
		
		sct1.myThread.start();
		
		//ct1.run();
		
		for(int i=1; i<=5;i++) {
			System.out.println(mainThread.getName() + ":" + i);
			
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println(mainThread.getName() + " : " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}