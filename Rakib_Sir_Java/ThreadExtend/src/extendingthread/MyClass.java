package extendingthread;

class MyThread extends Thread {
	
	MyThread(String name) {
		super(name);
		start();
	}

	public void run() {
		System.out.println(getName() + " starting.");
		try {
			for (int count=0; count<10; count++) {
				Thread.sleep(400);
				System.out.println("In "+ getName() + ", count is "+count);
			}
		}
		catch(InterruptedException e) {
			System.out.println(getName()+ " interrupted");
			
		}
		System.out.println(getName() + " terminating");
	}

}


public class MyClass {
	public static void main(String[] args) {
		System.out.println("Main thread starting");
		
		MyThread mt1 = new MyThread("Thread: Analysis");
		MyThread mt2 = new MyThread("Thread: Download");
		
		for (int i=0; i<50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("Main thread interrupted");
			}
			
		}
		System.out.println("Main thread ending.");
	}

}

