package software;


public class Book {
	private String title;
	private String author;
	private String signature;
	private String isbn;


	public Book(String title, String author, String signature, String isbnn) {
		this.title = title;
		this.author = author;
		this.signature = signature;
		this.isbn = isbnn;

	}

	public String toString() {
		return ("Title: " + title + "\t" + "Author: " + author + "\t" + "ISBN: " + isbn + "\t" + "Signature: "
				+ signature);
	}
}
