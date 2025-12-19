

class A {
	int RAM;
	String brand;
	
	A() {
		RAM = 8;
		brand = "HP";
	}
	
	A(int x) {
		RAM = x;
		brand = "HP";
	}
	
}

public class Day3 {
	public static void main(String[] args){
		A a1 = new A();
		System.out.println("RAM: "+a1.RAM+ " GB");
		System.out.println("Brand: "+a1.brand);
		System.out.println();
		A a2 = new A(16);
		System.out.println("RAM: "+a2.RAM+ " GB");
		System.out.println("Brand: "+a2.brand);
		
		

	}
}
