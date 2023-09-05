package hotelManagementSystem;

public class FrontDesk extends Employee {
	FrontDesk(){
		
	}
	FrontDesk(Employee employee, String department){
		setDepartment(department);
	}
	
	protected void checkInGuests() {
		System.out.println("Guests are added ");
	}
}
