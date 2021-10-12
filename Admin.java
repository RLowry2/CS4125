public class Admin {
	public int AdminID;
	public String username;
	public String password;
	
	public User(String username, int AdminID) {
		this.username = username;
		this.AdminID = AdminID;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getAdminID() {
		return AdminID;
	
	public void setAdminID(int AdminID){
		this.AdminID = AdminID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Room addRoom() {
		
	}
	
	public Room removeRoom() {
	
	}
	
	public Book addBook() {
	
	}
	
	public Book removeBook() {
	
	}
}