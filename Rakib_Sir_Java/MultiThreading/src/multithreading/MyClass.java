package multithreading;

class MyThread implements Runnable {
	String thrdName;
	MyThread(String name) {
		thrdName = name;
	}

	public void run() {
		System.out.println(thrdName + " starting.");
		try {
			for (int count=0; count<10; count++) {
				Thread.sleep(100);
				System.out.println("In "+thrdName + ", count is "+count);
			}
		}
		catch(InterruptedException e) {
			System.out.println(thrdName+ " interrupted");
			
		}
		System.out.println(thrdName + " terminating");
	}

}


public class MyClass {
	public static void main(String[] args) {
		System.out.println("Main thread starting");
		
		MyThread mt = new MyThread("Child #1");
		
		Thread newThread = new Thread(mt);
		
		newThread.start();
		
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
