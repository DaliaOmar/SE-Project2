package software;


public class Book {
	private String title;
	private String author;
	private String signature;
	private String ISBN;

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
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Book() {
		this.ISBN = "";
		this.title = "";
		this.author = "";
		this.signature = "";
	}

	public Book(String title, String author, String signature, String ISBN) {
		this.title = title;
		this.author = author;
		this.signature = signature;
		this.ISBN = ISBN;

	}

	public String toString() {
		return ("Title: " + title + "\t" + "Author: " + author + "\t" + "ISBN: " + ISBN + "\t" + "Signature: "
				+ signature);
	}
}
