package hotelManagementSystem;

public class KitchenStaff extends Employee{

	KitchenStaff(Employee employee, String department){
		setDepartment(department);
	}
	@Override
	public String toString() {
		return getDepartment();
	}
	static int mealPreparedCount = 0;
protected static void prepareMeal() {
	System.out.println("Meal Ready");
	mealPreparedCount++;
	
}
}
