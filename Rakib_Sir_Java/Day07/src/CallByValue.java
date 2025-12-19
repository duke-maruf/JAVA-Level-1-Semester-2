class Test {
	void sum(int a, int b) {
		a = a + 10;
		b = b - 20;
	}
}
public class CallByValue {
	public static void main(String[] args) {
		int a = 0, b = 0;
		
		Test t1 = new Test();
		t1.sum(a, b); // values will be copied
		
		System.out.println(a + " " + b); // a = 0, b = 0 
	}

}
