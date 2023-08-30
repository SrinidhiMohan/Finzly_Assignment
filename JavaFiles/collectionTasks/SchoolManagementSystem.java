package collectionTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nGender: " + gender;
    }
}

class Student extends Person {
    private int rollNumber;
    private String grade;

    public Student(String name, int age, String gender, int rollNumber, String grade) {
        super(name, age, gender);
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public String toString() {
        return super.toString() + "\nRoll Number: " + rollNumber + "\nGrade: " + grade;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public String toString() {
        return super.toString() + "\nSubject: " + subject;
    }
}

public class SchoolManagementSystem {
    private List<Student> students;
    private List<Teacher> teachers;

    public SchoolManagementSystem() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addStudent(String name, int age, String gender, int rollNumber, String grade) {
        Student student = new Student(name, age, gender, rollNumber, grade);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void addTeacher(String name, int age, String gender, String subject) {
        Teacher teacher = new Teacher(name, age, gender, subject);
        teachers.add(teacher);
        System.out.println("Teacher added successfully.");
    }

    public void displayStudentDetails() {
        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println(student);
            System.out.println("--------------");
        }
    }

    public void displayTeacherDetails() {
        System.out.println("Teacher Details:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
            System.out.println("--------------");
        }
    }

    public static void main(String[] args) {
        SchoolManagementSystem schoolSystem = new SchoolManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSchool Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Student Details");
            System.out.println("4. Display Teacher Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student gender: ");
                    String studentGender = scanner.nextLine();
                    System.out.print("Enter student roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student grade: ");
                    String grade = scanner.nextLine();
                    schoolSystem.addStudent(studentName, studentAge, studentGender, rollNumber, grade);
                    break;
                case 2:
                    System.out.print("Enter teacher name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter teacher age: ");
                    int teacherAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter teacher gender: ");
                    String teacherGender = scanner.nextLine();
                    System.out.print("Enter teacher subject: ");
                    String subject = scanner.nextLine();
                    schoolSystem.addTeacher(teacherName, teacherAge, teacherGender, subject);
                    break;
                case 3:
                    schoolSystem.displayStudentDetails();
                    break;
                case 4:
                    schoolSystem.displayTeacherDetails();
                    break;
                case 5:
                	System.out.println("Do you really want to exit ? (y/n)");
    				char ch = scanner.next().charAt(0);
    				
    				if(ch == 'y') {
    					System.out.println("Bye have a good day!");
    					System.exit(0);
    				}else {
    					break;
    				}
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
