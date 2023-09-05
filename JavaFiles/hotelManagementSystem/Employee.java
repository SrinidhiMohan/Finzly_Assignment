package hotelManagementSystem;

public class Employee {
	
	Employee(){
		
	}
	
	Employee(String employeeName, String employeeId, String department){
		
		setEmployeeName(employeeName);
		setEmployeeId(employeeId);
		setDepartment(department);
	}
	private String employeeName;
	private String employeeId;
	private String department;
	public String getDepartment() {
		return employeeName;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee Name: "+ employeeName + "\n Employee Id:" + employeeId + "\n" +"Department : " + department+"\n";
	}

protected static void hire() {
	
}
protected static  void fire() {
	
}

}
