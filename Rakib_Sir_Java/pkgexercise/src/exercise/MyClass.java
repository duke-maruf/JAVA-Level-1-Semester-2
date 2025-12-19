package exercise;

interface Login {
	int PORT = 113; // by default public, static, final
	public void checkPassword();
}


public class MyClass implements Login {
	public static void main(String[] args) {
		System.out.println(PORT);
	}
	public void checkPassword() {
		
	}
}
