import java.nio.file.FileAlreadyExistsException;

class A {
	
}

public class MyClass {
	public static void main(String[] args) {
		int a[] = { 3, 5, 10, 6};
		int b[] = { 0, 1, 0};
		int result;
		for (int i=0; i<a.length; i++) {
			try {
				System.out.println();
				result = a[i]/b[i];
				System.out.println(result);
			}
			catch (ArithmeticException e) {
				System.out.println("Can't divide by zero!");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("No matching element found.");
			}
			finally {
				System.out.println("This is the final block");
			}
		}
		System.out.println("The program ended successfully.");
	}
}
