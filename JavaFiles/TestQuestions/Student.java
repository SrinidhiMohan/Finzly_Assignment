package assignmentJava.TestQuestions;
class StudentManagement{
	private int studentId;
	private String name;
	private static int totalStudents =100;
	
	void enrollStudent(int studentId, String name){
		this.studentId = studentId;
		this.name = name;
		totalStudents = totalStudents+1;
		System.out.println(studentId+ " Student enrolled successfull");
	}
	void dropStudent(int numberOfStudents) {
		totalStudents = totalStudents-numberOfStudents;
		System.out.println(numberOfStudents+ " Students dropped");
	}
}
public class Student {
	public static void main(String[] args) {
		StudentManagement sm = new StudentManagement();
		sm.enrollStudent(101, "Srinidhi");
		sm.dropStudent(2);
}
}
