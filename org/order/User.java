package org.order;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
	private String UserId;
	private String UserName;
	private String UserEmail;
	private String UserNumber;
	private String UserDob;
	private String UserAddress;

	public String getUserId() {
		return UserId;
	}

	public String getUserName() {
		return UserName;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public String getUserNumber() {
		return UserNumber;
	}

	public String getUserDob() {
		return UserDob;
	}

	public String getUserAddress() {
		return UserAddress;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public void setUserNumber(String userNumber) {
		UserNumber = userNumber;
	}

	public void setUserDob(String userDob) {
		UserDob = userDob;
	}

	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}

}
