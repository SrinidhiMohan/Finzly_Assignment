package hotelReservationSystem;

@SuppressWarnings("serial")
public class RoomNotFoundException extends RuntimeException {

	public RoomNotFoundException(String message) {
		super(message);
	}
	
	public RoomNotFoundException() {
		super();
	}
}
