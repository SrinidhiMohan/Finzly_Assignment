package hibernateEmployeeTask;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


public class EmployeeManagement {
	
	public static void main(String[] args) {
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Criteria Functionality");
			System.out.println();
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				Scanner scan1 = new Scanner(System.in);
				
				scan1.nextLine();
				
				System.out.println("Enter employee first name:");
				String fname = scan1.nextLine();
				
				System.out.println("Enter employee last name:");
				String lname = scan1.nextLine();
				
				System.out.println("Enter employee id:");
				int id = scan1.nextInt();
				
				scan1.nextLine();

				System.out.println("Enter dob:");
				String dob = scan1.nextLine();
				
				System.out.println("Enter email:");
				String email = scan1.nextLine();
				
				System.out.println("Enter dept:");
				String dept = scan1.nextLine();
				
				System.out.println("Enter salary:");
				String salary = scan1.nextLine();
				
				
				
				System.out.println();
				
				
				EmployeeManagement.addEmployee(fname,lname,id,dob,email, dept,salary);
				System.out.println("Employee Details added");
				
				break;
				
			case 2:
				Scanner scan4 = new Scanner(System.in);
				System.out.println("Enter employee id:");
				int searchId = scan4.nextInt();
				
				EmployeeManagement.searchEmployee(searchId);
				break;
			case 3:
				Scanner scan2 = new Scanner(System.in);
				
				scan2.nextLine();
				
				System.out.println("Enter employee first name:");
				String updFname = scan2.nextLine();
				
				System.out.println("Enter employee last name:");
				String updLname = scan2.nextLine();
				
				System.out.println("Enter employee id:");
				int updId = scan2.nextInt();
				
				scan2.nextLine();

				System.out.println("Enter dob:");
				String updDob = scan2.nextLine();
				
				System.out.println("Enter email:");
				String updEmail = scan2.nextLine();
				
				System.out.println("Enter dept:");
				String updDept = scan2.nextLine();
				
				System.out.println("Enter salary:");
				String updSalary = scan2.nextLine();
				
				
				
				System.out.println();
				
				EmployeeManagement.updateEmployee(updFname,updLname,updId,updDob,updEmail,updDept,updSalary);
				System.out.println("Employee Details updated");
				break;
			case 4:
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Enter employee id:");
				int deleteId = scan3.nextInt();
				
				System.out.println();
				
				EmployeeManagement.deleteEmployee(deleteId);
				break;
			case 5:
				EmployeeManagement.criteriaFunctionality();
				break;
				
			default:
				System.out.println("Please enter a valid choice");
					
			}
			
			}while(true);
	}
	static void addEmployee(String fname, String lname,int id, String dob,String email, String dept,String salary) {
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Transaction tr = session.beginTransaction();
		Employee bl = new Employee();
		bl.setFname(fname);
		bl.setLname(lname);
		bl.setId(id);
		bl.setDob(dob);
		bl.setSalary(salary);
		bl.setEmail(email);
		bl.setDept(dept);
		
		session.save(bl);
		tr.commit();
		System.out.println("Details added");
		}

	static void searchEmployee(int searchId) {
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Transaction tr = session.beginTransaction();
		criteria.add(Restrictions.eq("id",searchId));
		
		 // Display all employees 
//		criteria.add(Restrictions.isNotNull("id"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);		}
	}
	
	static void updateEmployee(String updFname, String updLname,int updId, String updDob,String updEmail, String updDept, String updSalary){
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Transaction tr = session.beginTransaction();
		Employee bl = new Employee();
		bl.setFname(updFname);
		bl.setLname(updLname);
		bl.setId(updId);
		bl.setDob(updDob);	
		bl.setEmail(updEmail);
		bl.setDept(updDept);
		bl.setSalary(updSalary);
		session.update(bl);
		tr.commit();
		System.out.println("Details updated");
	}
	
	
	static void deleteEmployee(int deleteId) {

		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
	    Transaction tr = session.beginTransaction();
		Employee bl = new Employee();
		bl.setId(deleteId);
		
		
		session.delete(bl);
		tr.commit();
		System.out.println("Employee Deleted");
	}
	static void criteriaFunctionality() {
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
//		 a. Get the employees who is having salary getter that 30000.
//		criteria.add(Restrictions.gt("salary","30000"));

//		 b. Get the employees who has department developer and tester
//		criteria.add(Restrictions.or(Restrictions.eq("dept","developer"),Restrictions.eq("dept","tester")));

//		 c. Get the employees from all the departments other than tester.
//		criteria.add(Restrictions.ne("dept","tester"));
//		 d. Sort (descending) the employees based of their salary.
         criteria.addOrder(Order.desc("salary"));		
//		criteria.add(Restrictions.isNotNull("id"));
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);		}

		
		



	}
	
}










