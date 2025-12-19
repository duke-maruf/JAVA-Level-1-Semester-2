abstract class Shape {
	double width;
	double height;

	abstract void area();
	abstract void circumference();
}

class Rectangle extends Shape {
	Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	void area() {
		double area = width * height;
		System.out.println("Area of rectangle: " + area);
	}
	void circumference() {
		double c = 2 * (width + height);
		System.out.println("Circumference of rectangle: " + c);
	}
}
class Circle extends Shape {
	double radius;
	Circle (double r) {
		radius = r;
	}
	void area() {
		double a = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of circle: " + a);
	}
	void circumference() {
		double c = 2 * 3.14 * radius;
		System.out.println("Circumference of circle: " + String.format("%.2f", c));
	}
}

public class MyClass {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5.0, 6.0);
		r1.area();
		r1.circumference();
		Circle c1 = new Circle(5);
		c1.area();
		c1.circumference();
	}
}


