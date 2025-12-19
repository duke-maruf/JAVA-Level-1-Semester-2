class TestCR {
	private int a, b;
	TestCR(int i, int j) {
		a = i;
		b = j;
	}
	void sum(TestCR t) { // t1 and t have same address
		t.a = t.a + 10;
		t.b = t.b + 20;
	}
	int getA() {
		return a;
	}
	int getB() {
		return b;
	}
}
