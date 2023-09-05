package hotelManagementSystem;

public class Maintainence extends Employee{
Maintainence(Employee employee, String department){
	setDepartment(department);
	}
static int issueFixedCount=0;
 protected void fixIssue() {
	 System.out.println("Issue Fixed");
	 issueFixedCount++;
	 
 }
}
