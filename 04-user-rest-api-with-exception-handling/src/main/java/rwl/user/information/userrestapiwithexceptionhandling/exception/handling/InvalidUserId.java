package rwl.user.information.userrestapiwithexceptionhandling.exception.handling;


public class InvalidUserId extends RuntimeException {
	public InvalidUserId() {
		super("input User Id is invalid");
	}
}
