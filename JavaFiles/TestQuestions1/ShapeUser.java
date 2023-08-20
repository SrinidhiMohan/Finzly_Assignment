package assignmentJava.TestQuestions1;
import java.text.DecimalFormat;
interface Shape{
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
}
class Circle implements Shape{
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	Circle(double radius){
		setRadius(radius);
	}
	public void calculateArea() {
		System.out.println("Area of the circle is: " +(3.14* Math.pow(getRadius(),2)));
	}
	public void calculatePerimeter() {
		double peri = 2*3.14* getRadius();
		DecimalFormat roundOff = new DecimalFormat("##.00");
		System.out.println("Perimeter of the circle is: " + roundOff.format(peri));
	}
}
class Rectangle implements Shape{
	private double l,b;
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	Rectangle(double l,double b){
		setL(l);setB(b);
	}
	public void calculateArea() {
		System.out.println("Area of the Rectangle is: " + (getL()*getB()));
	}
	public void calculatePerimeter() {
		System.out.println("Area of the Rectangle is: " + (2*(getL()+getB())));
	}
}
class Triangle implements Shape{
	private double a,b,c,h;
	Triangle(double a, double b, double c, double h){
		setA(a);setB(b);setC(c);setH(h); 
		
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public void calculateArea() {
		System.out.println("Area of the Triangle is: " +((getC()*getH())/2));
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter of the Triangle is: " +(getA()+getB()+getC()));
	}
}
public class ShapeUser {
public static void main(String[] args) {
	Circle c1 = new Circle(5);
	c1.calculateArea();
	c1.calculatePerimeter();
	Rectangle r1 = new Rectangle(10,20);
	r1.calculateArea();
	r1.calculatePerimeter();
	Triangle t1 = new Triangle(3.0,4.0,5.0,5.0);
	t1.calculateArea();
	t1.calculatePerimeter();
}
}
