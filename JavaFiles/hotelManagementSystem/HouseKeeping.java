package hotelManagementSystem;

public class HouseKeeping extends Employee {
HouseKeeping(Employee employee, String department){
	setDepartment(department);
	}
	static int cleanRoomCount = 0;
	protected void cleanRoom() {
	System.out.println("Room Cleaned");
	cleanRoomCount++;
}
}
