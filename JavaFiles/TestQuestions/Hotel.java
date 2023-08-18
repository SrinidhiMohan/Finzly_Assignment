package assignmentJava.TestQuestions;

class Room {

	int roomNumber;
	int capacity;
	double pricePerNight;
	String checkin;
	String checkout;
	static int totalRooms=2;
	static int availableRooms=totalRooms;
	
	boolean checkAvailability() {
		if(availableRooms>0) {
		  System.out.println("Rooms are available");
		  return true;
		}
		else {
		  System.out.println("Rooms are not available");
		  return false;
		}
		
	}
	void makeReservation(int roomNumber,int capacity,double pricePerNight) {
		if(checkAvailability()==true) {
			this.roomNumber=roomNumber;
			this.capacity=capacity;
			this.pricePerNight=pricePerNight;
			availableRooms--;
			System.out.println(toString());
		}
	}
	void makeReservation(int roomNumber,int capacity,double pricePerNight,String checkin,String checkout) {
		if(checkAvailability()==true) {
			this.roomNumber=roomNumber;
			this.capacity=capacity;
			this.pricePerNight=pricePerNight;
			this.checkin=checkin;
			this.checkout=checkout;
			availableRooms--;
			System.out.println(toString()+" with checkin date "+checkin+" and checkout date "+checkout);
		}
	}
	@Override
	public String toString() {
		String newString="Room number:"+roomNumber+" with capacity of "+capacity+" people that cost Rs. "+pricePerNight+" price per night";
		return newString;
		
	}
}
public class Hotel {

	public static void main(String[] args) {
		Room r=new Room();
		r.makeReservation(10, 4, 2000,"30/7/23","2/8/23");
		r.makeReservation(10, 4, 2000);
		r.makeReservation(10, 4, 2000,"30/7/23","2/8/23");
		//r.makeReservation(10, 4, 2000);
//		r.makeReservation(10, 4, 2000,"30/7/23","2/8/23");
//		r.makeReservation(10, 4, 2000,"30/7/23","2/8/23");
//		r.makeReservation(10, 4, 2000,"30/7/23","2/8/23");
	}
}

// Trying Different Approach
//class Room{
//	private int roomNumber;
//	private int capacity;
//	private static int pricePerNight = 700;
//	public int getCapacity() {
//		return capacity;
//	}
//
//	public void setCapacity(int capacity) {
//		this.capacity = capacity;
//	}
//
//	public static int getPricePerNight() {
//		return pricePerNight;
//	}
//
//	public static void setPricePerNight(int pricePerNight) {
//		Room.pricePerNight = pricePerNight;
//	}
//
//	public int getRoomNumber(int roomNumber) {
//		if(CheckAvailability()) {
//		System.out.println("Congratulations ! Your room number is:");
//		capacity = capacity-1;
//		return roomNumber;
//		}else {
//			System.out.println(toString());
//			return 0;
//		}
//	}
//
//	public void setRoomNumber(int roomNumber) {
//		this.roomNumber = roomNumber;
//	}
//	Boolean CheckAvailability(){
//		if(capacity >0) {
//			System.out.println("Rooms Available");
//			return true;
//		}else {
//			System.out.println(toString());
//			return false;
//		}
//	}
//	@Override
//	public String toString() {
//		return "Sorry No Rooms Available" ;
//	}
//}
//public class Hotel {
//public static void main(String[] args) {
//	Room user1 = new Room();
//	user1.setCapacity(2);
//	user1.CheckAvailability();
//	user1.getRoomNumber(101);
//	user1.getRoomNumber(102);
//	user1.CheckAvailability();
//}
//}
