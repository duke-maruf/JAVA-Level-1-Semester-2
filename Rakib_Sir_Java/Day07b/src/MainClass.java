public class MainClass {
	public static void main(String[] args) {

		// Call by value
		int a = 0, b = 0;
		TestCV t1 = new TestCV();
		t1.sum(a, b); // values will be copied
		System.out.println(a + " " + b); // a = 0, b = 0
		
		// Call by reference
		TestCR t2 = new TestCR(10, 10);
		System.out.println("Before calling, a = " + t2.getA() 
							+ ", b = " + t2.getB());
		t2.sum(t2);
		System.out.println("After calling, a = " + t2.getA() 
							+ ", b = " + t2.getB());

	}
}
