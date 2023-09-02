package rwl.user.information.userrestapiwithexceptionhandling.binding.classes;

public class UserObject {

	private Integer userId;
	
	private String userName;
	
	private String userCellNumber;
	
	private String userEmail;
	
	public UserObject() {}

	public UserObject(Integer userId, String userName, String userCellNumber, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userCellNumber = userCellNumber;
		this.userEmail = userEmail;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCellNumber() {
		return userCellNumber;
	}

	public void setUserCellNumber(String userCellNumber) {
		this.userCellNumber = userCellNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userCellNumber=" + userCellNumber
				+ ", userEmail=" + userEmail + "]";
	}
	
}
