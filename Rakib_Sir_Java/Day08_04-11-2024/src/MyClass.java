class Book {
	private String title;
	private String author;
	private long ISBN;
	
	Book(String title, String author, long ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	void searchBook(String title) {
		if(this.title.equalsIgnoreCase(title)) {
			showBookDetails();
		}
		else
			System.out.println("Book not found!");
	}
	void searchBook(String title, String author) {
		if(this.title.equalsIgnoreCase(title) && this.author.equalsIgnoreCase(author)) {
			showBookDetails();
		}
		else
			System.out.println("Book not found!");
	}
	void searchBook(long ISBN) {
		if(this.ISBN == ISBN) {
			showBookDetails();
		}
		else
			System.out.println("Book not found!");
	}
	
	void showBookDetails() {
		System.out.println("Book details:");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("ISBN" + ISBN);
	}
}
public class MyClass {
	public static void main(String[] args) {
		Book b1 = new Book("Beginning Java", "Herbertschildt", 2356235623235L);
		Book b2 = new Book("Java Complete Reference", "Herbertschildt", 9999235623235L);
		Book b3 = new Book("Software Engineering", "Smith", 9865326598652L);
		
		b1.searchBook("Java");
		System.out.println();
		b1.searchBook("beginning Java");
		System.out.println();
		b2.searchBook(9999235623235L);
		System.out.println();
		b3.searchBook("software engineering", "Smith");
		
		
	}
}
