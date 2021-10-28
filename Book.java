public class Book {
	public int bookID;
	public String title;
	public String authors;
	public int quantity;
	
	public Book(String title, int bookID, String authors) {
		this.title = title;
		this.bookID = bookID;
		this.authors = authors;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getBookID() {
		return bookID;
	}
	
	public String getAuthors() {
		return authors;
	}
	
	public int getQuantity(String title) {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public boolean isBookAvailable(String title) {
		if(quantity <= 0){
			return false;
		}
		return true;
	}
}