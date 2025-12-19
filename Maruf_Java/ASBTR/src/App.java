abstract class Shape{
    double width;
    double height;
    abstract void area();
    abstract void circumference();
}
/*class Rectangle extends Shape{
    void area(){
       
    }
    void circumference(){

    }
}*/
class Rectangle extends Shape{
	Rectangle(double w,double h){
		width=w;
		height=h;
	}
    void area(){
        double area=width*height;
        System.out.println("Area of rectangle: "+area);
       
    }
    void circumference(){
        double c=2*(width+height);
        System.out.println(c);
    }
}
class Circle extends Shape{
	
	double r;
	Circle(double a){
		r=a;
	}
	void area() {
		double a=Math.PI*Math.pow(r, 2);
		System.out.println(a);
	}
	void circumference() {
		double c=2*3.14*r;
		System.out.println(c);
	}
}
public class App {
    public static void main(String[] args) {
       Rectangle r1=new Rectangle(2,3);
       r1.area();
       r1.circumference();
       Circle c1=new Circle(10);
       c1.area();
       c1.circumference();
    }
}
