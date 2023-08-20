package assignmentJava.TestQuestions1;
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
	Manager(String name, String id, String department){
		setName(name);
		setId(id);
		setDepartment(department);
		System.out.println("The manager details are as follows:");
		System.out.println("Name: " + getName()+ "\n"+"Id: "+ getId() +"\n"+ "Department: "+getDepartment()+"\n");
	}
	private String department;
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
}
class Developer extends Employee{
	Developer(String name, String id, String programmingLanguage){
		setName(name);
		setId(id);
		setProgrammingLanguage(programmingLanguage);
		System.out.println("The developer details are as follows:");
		System.out.println("Name: " + getName()+ "\n"+"Id: "+ getId() +"\n"+ "Programming Language: "+getProgrammingLanguage()+"\n");
	}
	private String programmingLanguage;
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage=programmingLanguage;
	}
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
}
public class EmployeeUser {
	public static void main(String[] args) {
	Manager m1 = new Manager("Saishree GR","M001","Operations");
	Developer d1 = new Developer("Srinidhi Mohan","E001","Java");
}
}
