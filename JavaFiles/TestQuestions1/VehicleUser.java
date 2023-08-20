package assignmentJava.TestQuestions1;
interface Vehicle{
	public abstract void start();
	public abstract void accelerate();
	public abstract void brake();
}
class Car implements Vehicle{
	public void start() {
		System.out.println("The Car is started.");
	}
	public void accelerate() {
		System.out.println("The Car is moving.");
	}
	public void brake() {
		System.out.println("The brake is applied and car is stopped.");
	}
}
class Motorcycle implements Vehicle{
	public void start() {
		System.out.println("The Motorcycle is started.");
	}
	public void accelerate() {
		System.out.println("The Motorcycle is moving.");
	}
	public void brake() {
		System.out.println("The break is applied and motorcycle is stopped.");
	}
}
public class VehicleUser {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.start();
		car1.accelerate();
		car1.brake();
		Motorcycle mc1 = new Motorcycle();
		mc1.start();
		mc1.accelerate();
		mc1.brake();
		
	}

}
