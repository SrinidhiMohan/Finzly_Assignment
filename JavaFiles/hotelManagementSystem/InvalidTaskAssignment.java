package hotelManagementSystem;

public class InvalidTaskAssignment extends Exception{
	InvalidTaskAssignment(){
	super();
}
	InvalidTaskAssignment(String message){
		super(message);
	}
}
