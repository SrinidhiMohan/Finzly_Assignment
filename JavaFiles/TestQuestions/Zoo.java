package assignmentJava.TestQuestions;

class Animal{
	private int age;
	private String name;
	void makeSound() {
		System.out.println("Makes Sound");
		}
}
class Lion extends Animal{
	void makeSound() {
		System.out.println("Roars...");
	}
}
class Elephant extends Animal{
	void makeSound() {
		System.out.println("Pam...");
	}
}
class Giraffee extends Animal{
	void makeSound() {
		System.out.println("Giff...");
	}
}

public class Zoo {

	public static void main(String[] args) {
		Animal ln = new Lion();
		ln.makeSound();
		Animal el = new Elephant();
		el.makeSound();
		Animal gf = new Giraffee();
		gf.makeSound();

	}

}
