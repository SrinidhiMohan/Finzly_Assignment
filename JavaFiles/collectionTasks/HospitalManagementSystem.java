package collectionTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String gender;
    private String diagnosis;
    Patient(){
    	
    }

    public Patient(String name, int age, String gender, String diagnosis) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.diagnosis = diagnosis;
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

    public String getDiagnosis() {
        return diagnosis;
    }
}

public class HospitalManagementSystem {
    private Map<Integer, Patient> patientRecords;

    public HospitalManagementSystem() {
        patientRecords = new HashMap<>();
    }

    public void addPatient(int id, String name, int age, String gender, String diagnosis) {
        Patient patient = new Patient(name, age, gender, diagnosis);
        patientRecords.put(id, patient);
        System.out.println("Patient added successfully.");
    }

    public void viewPatientDetails(int id) {
        Patient patient = patientRecords.get(id);
        if (patient != null) {
            System.out.println("Patient ID: " + id);
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Gender: " + patient.getGender());
            System.out.println("Diagnosis: " + patient.getDiagnosis());
        } else {
            System.out.println("Patient not found.");
        }
    }

    public void listAllPatients() {
        System.out.println("List of Patients:");
        for (Map.Entry<Integer, Patient> entry : patientRecords.entrySet()) {
            System.out.println("Patient ID: " + entry.getKey());
            System.out.println("Name: " + entry.getValue().getName());
            System.out.println("Age: " + entry.getValue().getAge());
            System.out.println("Gender: " + entry.getValue().getGender());
            System.out.println("Diagnosis: " + entry.getValue().getDiagnosis());
            System.out.println("--------------");
        }
    }

    public static void main(String[] args) {
        HospitalManagementSystem hospital = new HospitalManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHospital Management System Menu:");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. List All Patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter patient ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter patient gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter patient diagnosis: ");
                    String diagnosis = scanner.nextLine();
                    hospital.addPatient(id, name, age, gender, diagnosis);
                    break;
                case 2:
                    System.out.print("Enter patient ID: ");
                    int viewId = scanner.nextInt();
                    hospital.viewPatientDetails(viewId);
                    break;
                case 3:
                    hospital.listAllPatients();
                    break;
                case 4:
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
