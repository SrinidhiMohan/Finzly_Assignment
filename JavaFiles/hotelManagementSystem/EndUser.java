package hotelManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class EndUser {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		
//		HashMap<String,Object> hm = new HashMap<>();
//		
//		ArrayList<KitchenStaff> kitchenStaffs = new ArrayList<>();
//		KitchenStaff k1 = new KitchenStaff(new Employee("Srinidhi","K001"),"Kitchen Department");
//		kitchenStaffs.add(k1);
//		ArrayList<HouseKeeping>  houseKeep = new ArrayList<>();
//		HouseKeeping h1 = new HouseKeeping(new Employee("Saishree","H001"),"House Keeping");
//		houseKeep.add(h1);
//		ArrayList<FrontDesk> reception = new ArrayList<>();
//		FrontDesk f1 = new FrontDesk(new Employee("Sridevi","F001"),"Front-desk");
//		reception.add(f1);
//		ArrayList<Maintainence> maintain = new ArrayList<>();
//		Maintainence m1 = new Maintainence(new Employee("Prema","M001"),"Maintainence");
//		maintain.add(m1);
//		hm.put("K001",k1);
//		hm.put("H001", h1);
//		hm.put("F001", f1);
//		hm.put("M001", m1);
//		
//	System.out.println(hm);
		HashMap<String,Employee> employeeDeatails = new HashMap();
		List<KitchenStaff> kitchen = new ArrayList();
		List<HouseKeeping> houseKeep = new ArrayList();
		List<Maintainence> maintain = new ArrayList();
		List<FrontDesk> frontDesk = new ArrayList();
		do {
		System.out.println("1. Add new Employee");
		System.out.println("2. Delete the employee");
		System.out.println("3. Display Employees");
		System.out.println("4. Exit");
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		
	
		switch(choice){
		case 1:
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Employee name");
			String employeeName = sc.nextLine();
			
			
			System.out.println("Enter Employee id");
			String employeeId = sc.nextLine();
			
			try {
			for(String id: employeeDeatails.keySet()) {
				if(employeeId.equalsIgnoreCase(id)) {
					throw new DuplicateIDExeption("Id already present..");
				}
				
			}
			}catch(DuplicateIDExeption e) {
				System.out.println(e);
				System.exit(0);
			}
			System.out.println("Enter department");
			String department = sc.nextLine();		
			
			
			Employee e1 = new Employee(employeeName,employeeId,department);
			employeeDeatails.put(employeeId, e1);
			
			if(department.charAt(0) ==  'k' || department.charAt(0) ==  'K'  ) {
				KitchenStaff k1 = new KitchenStaff(e1,department);
				kitchen.add(k1);
			}else if(department.charAt(0) ==  'h' || department.charAt(0) ==  'H'  ) {
				HouseKeeping k1 = new HouseKeeping(e1,department);
				houseKeep.add(k1);
			}else if(department.charAt(0) ==  'M' || department.charAt(0) ==  'm'  ) {
				Maintainence k1 = new Maintainence(e1,department);
				maintain.add(k1);
			}else 	if(department.charAt(0) ==  'F' || department.charAt(0) ==  'f'  ) {
				FrontDesk k1 = new FrontDesk(e1,department);
				frontDesk.add(k1);
			}
			
			System.out.println("Employees Added");
			break;
		case 2:
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Employee ID");
			String eId = sc1.nextLine();
			
			System.out.println("Enter Department:");
			String dpt = sc1.nextLine();
			
			employeeDeatails.remove(eId);
			
			if(dpt.charAt(0) ==  'k' || dpt.charAt(0) ==  'K'  ) {
				Iterator itr = kitchen.iterator();
		        while (itr.hasNext()) {
		            String x = (String) itr.next();
		            if (x.equalsIgnoreCase(eId))
		                itr.remove();
		        }
			}else if(dpt.charAt(0) ==  'h' || dpt.charAt(0) ==  'H'  ) {
				Iterator itr = houseKeep.iterator();
		        while (itr.hasNext()) {
		            String x = (String) itr.next();
		            if (x.equalsIgnoreCase(eId))
		                itr.remove();
		        }
			
			}else if(dpt.charAt(0) ==  'M' || dpt.charAt(0) ==  'm'  ) {
				Iterator itr = maintain.iterator();
		        while (itr.hasNext()) {
		            String x = (String) itr.next();
		            if (x.equalsIgnoreCase(eId))
		                itr.remove();
		        }
				
			}else 	if(dpt.charAt(0) ==  'F' || dpt.charAt(0) ==  'f'  ) {
				Iterator itr = frontDesk.iterator();
		        while (itr.hasNext()) {
		            String x = (String) itr.next();
		            if (x.equalsIgnoreCase(eId))
		                itr.remove();
		        }
			}
			
			System.out.println("Employee removed....");
			
			break;
		case 3:
			System.out.println(employeeDeatails);
//			System.out.println("Kitchen Staff");
//			System.out.println(kitchen);
//			System.out.println("Maintainence");
//			System.out.println(maintain);
//			System.out.println("House Keeping");
//			System.out.println(houseKeep);
//			System.out.println("Front Desk");
//			System.out.println(frontDesk);
			
			break;
		case 4:
            System.out.print("Do you really want to exit (y/n): ");
            char confirmExit = scan.next().charAt(0);
            if (confirmExit == 'y' || confirmExit == 'Y') {
                System.out.println("Bye - have a good day");
                return;
            }
            break;
		default:
			System.out.println("Please Enter a valid choice");
			System.out.println();
		}
		}while(true);
		
		
	}

}
