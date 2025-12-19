package syncthread;

class SumArray {
	private int sum;
	
	int sumArray(int nums[]) {
		sum = 0;
		
		for(int i=0; i<nums.length; i++) {
			sum+= nums[i];
			System.out.println("Running total for " 
			+ Thread.currentThread().getName()
			+ " is " + sum);
			
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				System.out.println("Thread interrupted.");
			}
		}
		return sum;
	}
}

class MyThread implements Runnable {
	Thread thread;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	MyThread(String name, int nums[]) {
		thread = new Thread(this, name);
		a = nums;
		thread.start();
	}
	
	public void run() {
		System.out.println(thread.getName() + " starting.");
		
		answer = sa.sumArray(a);
		System.out.println("Sum for "+ thread.getName()
		+ " is " + answer);
		
		System.out.println(thread.getName() + " terminating.");
	}
}
public class MyClass {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		
		MyThread m1 = new MyThread("Child #1", a);
		MyThread m2 = new MyThread("Child #2", a);
		
		
		try {
			m1.thread.join();
			m2.thread.join();
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
	}
}
