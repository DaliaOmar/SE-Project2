package software;


public class Book {
	private String title;
	private String author;
	private String signature;
	private String isbn;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		isbn = isbn;
	}

	public Book() {
		this.isbn = "";
		this.title = "";
		this.author = "";
		this.signature = "";
	}

	public Book(String title, String author, String signature, String isbn) {
		this.title = title;
		this.author = author;
		this.signature = signature;
		this.isbn = isbn;

	}

	public String toString() {
		return ("Title: " + title + "\t" + "Author: " + author + "\t" + "ISBN: " + isbn + "\t" + "Signature: "
				+ signature);
	}
}
