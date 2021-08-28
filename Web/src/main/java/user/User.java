package user;

public class User {
	private int userID;
	private String userNick;
	private String userPW;
	private String userPerm;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserPerm() {
		return userPerm;
	}
	public void setUserPerm(String userPerm) {
		this.userPerm = userPerm;
	}
}
