package hotelReservationSystem;
@SuppressWarnings("serial")
public class InvalidReservationException extends RuntimeException {

	
	public InvalidReservationException(String message) {
		super(message);
	}
	
	public InvalidReservationException() {
		super();
	}
}
