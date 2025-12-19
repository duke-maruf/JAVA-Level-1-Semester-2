package exercise;
import book.Book;

public class Publisher extends Book{
	String publisher;
	
	Publisher(String title, String author, String p) {
		super(title, author);
		this.publisher = p;
	}

	public void showBook() {
		super.showBook();
		System.out.println("Publisher: " + publisher);
	}
}
