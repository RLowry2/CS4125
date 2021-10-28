import Room.java;
import Book.java;
public class Admin {
	public int AdminID;
	public String username;
	public String password;
	
	public void User(String username, int AdminID) {
		this.username = username;
		this.AdminID = AdminID;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getAdminID() {
		return this.AdminID;
	}
	
	public void setAdminID(int AdminID){
		this.AdminID = AdminID;
	}
	
	public String getPassword() {
		return this.password;
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