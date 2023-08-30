package collectionTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class EmployeeDetails {
	
private String name;
private String id;
private String phone;
private String address;

@Override
public String toString() {
	return  id+"    "+name+"    "+ phone+"      "+address+"\n";
}
EmployeeDetails(){ // just in case to view the details.
	
	
}
 EmployeeDetails(String name,String id,String phone,String address){
	this.name = name;
	this.id = id;
	this.phone = phone;
	this.address = address;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
class EmployeeManagement{
	
	static List<EmployeeDetails> employeeDetails = new ArrayList<>(); // holds all employee details 
	static HashMap<String, EmployeeDetails> searchEmpDetails = new HashMap<>(); // holds all employee details based on id 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("1. Add employee details.\n"
					          +"2. View employee details.\n"
					          +"3. Search employee based on id\n"
					          +"4. Exit.");
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				addEmployeeDetails();
				break;
			case 2:
				viewEmployeeDetails();
				break;
			case 3:
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Enter employee id to search:");
				String id = scan1.nextLine();
	
				searchEmployeeDetails(id);
				break;
			case 4:
				System.out.println("Do you really want to exit ? (y/n)");
				char ch = scan.next().charAt(0);
				
				if(ch == 'y') {
					System.out.println("Bye have a good day!");
					System.exit(0);
				}else {
					break;
				}
			default:
				System.out.println("Please enter a proper choice.");
			}
		}while(true);
		
	}
	static void addEmployeeDetails() { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id:");
		String id = scan.nextLine();
		
		System.out.println("Enter employee name:");
		String name = scan.nextLine();
		
		System.out.println("Enter employee phone number:");
		String phone = scan.nextLine();
		
		System.out.println("Enter employee address:");
		String address = scan.nextLine();
		employeeDetails.add(new EmployeeDetails(name, id,phone,address));
		searchEmpDetails.put(id,new EmployeeDetails(name, id,phone,address));
		System.out.println("Employee Details are added successfully..... \n");
		}
	static void viewEmployeeDetails() {
		System.out.println("\nID       Name          Phone         Address\n");
		System.out.println(employeeDetails);
		
	}
	static void searchEmployeeDetails(String id) {
		if(searchEmpDetails.containsKey(id)) {
			System.out.println("\nID       Name          Phone         Address\n");
			System.out.println(searchEmpDetails.get(id));
		}else {
			System.out.println("Employee not found");
		}
	}
	
}
