package myfolder;
class PC {
	double processor = 5.0; // GHz
	int ram = 32; // GB
	int ssd = 500; // GB
	String brand = "Dell";
	
	void showSpecs() {
		System.out.println("Processor: " + processor + "GHz");
		System.out.println("RAM: " + ram + " GB");
		System.out.println("SSD: " + ssd + " GB");
		System.out.println("Brand: " + brand);
	}
}
public class MyClass {
	public static void main(String[] args) {
		PC pc1 = new PC();
		System.out.println("Printing the specs of PC1");
		pc1.showSpecs();
		
		PC pc2 = new PC(), pc3 = new PC(), pc4 = new PC();
		System.out.println("\nPrinting the specs of PC4");
		pc4.showSpecs();
		
		pc4.ssd = 1024;
		pc4.ram = 64;
		System.out.println("\nPrinting the specs of PC4");
		pc4.showSpecs();
		
	
		
	}
}



