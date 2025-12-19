public class MyClass {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hellos";
		String s3 = "C";
		String s4 = "Hello Java, Java is an OOP language";
		
		System.out.println(s1.length());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s4.indexOf("Java"));
		System.out.println(s4.charAt(6));
		
		s1.concat("Java");
		System.out.println(s1);
		s1 = s1.concat("Java");
		System.out.println(s1);
				
		
		
	}
}
