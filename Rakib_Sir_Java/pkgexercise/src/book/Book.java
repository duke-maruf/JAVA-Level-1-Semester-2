package book;

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showBook() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}
}
