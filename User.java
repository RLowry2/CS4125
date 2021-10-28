public class User {
	public int UserID;
	public String username;
	public String password;
	
	public User(String username, int UserID) {
		this.username = username;
		this.UserID = UserID;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getUserID() {
		return UserID;
	}
	
	public void setUserID(int UserID){
		this.UserID = UserID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}