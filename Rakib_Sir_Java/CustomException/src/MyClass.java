class NonIntResultException extends Exception {
	int n;
	int d;
	NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}
	public String toString() {
		return "Result of " + n + " / " + d + " is non-integer.";
	}
}

public class MyClass {
	public static void main(String[] args) {
		int a[] = {4, 5, 6};
		int b[] = {2, 2, 0};
		
		for(int i=0; i<a.length; i++) {
			try {
				if((a[i] % 2) != 0) {
					throw new 
				}
					
			}
		}
	}

}
