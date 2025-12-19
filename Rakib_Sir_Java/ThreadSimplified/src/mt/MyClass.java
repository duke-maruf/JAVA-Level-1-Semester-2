package mt;

class MyThread implements Runnable {
	Thread t;
	MyThread(String name) {
		t = new Thread(this, name);
		t.start();
	}

	public void run() {
		System.out.println(t.getName() + " starting.");
		try {
			for (int count=0; count<10; count++) {
				Thread.sleep(400);
				System.out.println("In "+ t.getName() + ", count is "+count);
			}
		}
		catch(InterruptedException e) {
			System.out.println(t.getName()+ " interrupted");
			
		}
		System.out.println(t.getName() + " terminating");
	}

}


public class MyClass {
	public static void main(String[] args) {
		System.out.println("Main thread starting");
		
		MyThread mt = new MyThread("Child #1");
		
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
