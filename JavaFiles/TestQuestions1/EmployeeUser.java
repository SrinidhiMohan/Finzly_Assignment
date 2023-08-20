package assignmentJava.TestQuestions1;
import java.util.Scanner;
class Employee{
	private String name;
	private String id;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
}
class Manager extends Employee{
	private String department;
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	public void showDetails() {
		System.out.println("The manager details are:");
		System.out.println("Name: "+ getName()+"\n"+"ID: "+getId()+"\n"+"Department: "+ getDepartment()+"\n");
	}
}
class Developer extends Employee{
	private String programmingLanguage;
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage=programmingLanguage;
	}
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void showDetails() {
		System.out.println("The Developer details are:");
		System.out.println("Name: "+ getName()+"\n"+"ID: "+getId()+"\n"+"Programming Language: "+ getProgrammingLanguage()+"\n");
	}
}
public class EmployeeUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Manager m1 = new Manager();
	    System.out.println("Enter the name of the Manager: ");
	    m1.setName(sc.nextLine());
	    System.out.println("Enter the ID:");
	    m1.setId(sc.nextLine());
	    System.out.println("Enter department:");
	    m1.setDepartment(sc.nextLine());
	    m1.showDetails();
	    Developer d1 = new Developer();
	    System.out.println("Enter the name of the Developer: ");
	    d1.setName(sc.nextLine());
	    System.out.println("Enter the ID:");
	    d1.setId(sc.nextLine());
	    System.out.println("Enter Programming Language:");
	    d1.setProgrammingLanguage(sc.nextLine());
	    d1.showDetails();
}
}
