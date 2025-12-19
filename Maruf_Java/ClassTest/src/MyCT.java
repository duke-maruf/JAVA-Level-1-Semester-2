class Book{
	private String title;
	private String author;
	private double price;
	private static int bookcount=0;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
		bookcount++;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	void setTitle(String title) {
		this.title=title;
	}
	void setAuthor(String author) {
		this.author=author;
	}
	void setPrice(double price) {
		if(price>0)
		this.price=price;
	}
	
	
public static int getTotalBooks() {
	System.out.println(bookcount);
	 return bookcount;
	}
}
public class MyCT {

	public static void main(String[] args) {
		Book b1=new Book("Java","Maruf",120);
		Book b2=new Book("C++","Ahshan",80);
		Book b3=new Book("FAt","John",100);
		b1.setTitle("Cenet");
		b1.setAuthor("Jane");
		b1.setPrice(300);
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getPrice());
		System.out.println(b3.getTitle());
		System.out.println(b3.getAuthor());
		System.out.println(b3.getPrice());

       Book.getTotalBooks();
		

	}

	

}
