package threadpriority;

class Priority implements Runnable {
	int count;
	Thread thread;
	
	static boolean stop = false;
	static String currentName;
	
	Priority(String name) {
		thread = new Thread(this, name);
		count = 0;
		currentName = name;
	}
	
	public void run () {
		System.out.println(thread.getName() + " starting.");
		do {
			count++;
			if(currentName.compareTo(thread.getName()) != 0 ) {
				currentName = thread.getName();
				System.out.println("In " + currentName);
			}
		} while (stop == false && count < 1000000);
		stop = true;
		
		System.out.println("\n" + thread.getName() + " terminating.");
	}
}

public class MyClass {
	public static void main(String[] args) {
		Priority p1 = new Priority("High priority");
		Priority p2 = new Priority("Low priority");
		
		p1.thread.setPriority(Thread.NORM_PRIORITY + 2);
		p2.thread.setPriority(Thread.NORM_PRIORITY - 2);
		
		p1.thread.start();
		p2.thread.start();
		
		try {
			p1.thread.join();
			p2.thread.join();
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("\nHigh priority thread counted to "+p1.count);
		System.out.println("Low priority thread counted to "+p2.count);
	}
	

}
