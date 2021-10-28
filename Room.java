package CS4125;
public class Room {
	public int roomID;
	public int quantity;
	
	public Room(int roomID) {
		this.roomID = roomID;
	}
	
	public int getRoomID() {
		return roomID;
	}
	
	public int getAvailability() {
		return availability;
	}
	
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	
	public boolean isRoomAvailable(String roomID) {
		if(availability <= 0){
			return false;
		}
		return true;
	}
}