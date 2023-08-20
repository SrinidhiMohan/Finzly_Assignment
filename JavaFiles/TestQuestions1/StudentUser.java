package assignmentJava.TestQuestions1;
class Student{
	private static int totalStudentCount;
	private String name;
	private String studentID;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >0&&age<=150) {
		this.age = age;
		}else {
			System.out.println("Enter a valid age");
		}
	}
	public int getTotalStudentCount() {
		return totalStudentCount;
	}
	
	Student(){
		setName("Unknown");
		setStudentID("1001S1");
		setAge(0);
		totalStudentCount++;
		System.out.println("The Details of the Student added:");
		System.out.println("Name: " + getName()+ "\n"+"Student ID: "+ getStudentID()+"\n"+"Age: " +getAge() + "\n");
	}
	Student(String name, String studentID,int age){
		setName(name);
		setStudentID(studentID);
		setAge(age);
		totalStudentCount++;
		System.out.println("The Details of the Student added:");
		System.out.println("Name: " + getName()+ "\n"+"Student ID: "+ getStudentID()+"\n"+"Age: " +getAge()+ "\n");
	}
	Student(int age){
		setName("Unknown");
		setStudentID("0");
		setAge(age);
		totalStudentCount++;
		System.out.println("The Details of the Student added:");
		System.out.println("Name: " + getName()+ "\n"+"Student ID: "+ getStudentID()+"\n"+"Age: " +getAge()+ "\n");
	}
	
}
public class StudentUser {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("Srindhi", "1002S2", 23);
		Student student3 = new Student(1000);
		
	}
}
