package warmup;

public class Book {

	String author;
	String title;
	String type;
	double price;

	public Book(String author) {
		this.author = author;
	}

	public Book(String author, String title) {
		this(author);
		this.title = title;
	}

	public Book(String author, String title, String type) {
		this(author, title);
		this.type = type;
	}

	public void setBookInformation(String author, String title, String type, double price) {
		this.author = author;
		this.title = title;
		this.type = type;
		this.price = price;
		System.out.println("Author: " + author + "\nTitle: " + title + "\nType: " + type + "\nPrice: " + price);
	}

	public Book(String author, String title, String type, double price) {
		setBookInformation(author, title, type, price);
	}

	public Book() {

	}

}
