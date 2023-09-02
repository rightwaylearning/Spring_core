package rwl.user.information.userrestapiwithexceptionhandling.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "mine_user")
	@TableGenerator(
			name="mine_user",
			table = "mone_table_pk",
			pkColumnName = "key_name",
			valueColumnName = "key_value",
			pkColumnValue = "user_pk_value",
			initialValue = 0,
			allocationSize = 1
			)
	private Integer userId;
	
	@Column(name = "user_name")
	@Setter
	@Getter
	private String userName;
	
	@Column(name = "user_contact")
	private String userCellNumber;
	
	@Column(name = "user_email")
	private String userEmail;
	
	public User() {}

	public User(Integer userId, String userName, String userCellNumber, String userEmail) {
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
