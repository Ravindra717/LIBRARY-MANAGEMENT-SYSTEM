package Library;

import java.util.ArrayList;

public class Book {
	
	private String name;
	private String author;
	private String publisher;
	private String address;
	private String status;
	private int qty;
	private double price;
	private int brwcopies;
	
	public Book() {}

	public Book(String name, String author, String publisher, String address, String status, int qty, double price,
			int brwcopies) {
		super();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.address = address;
		this.status = status;
		this.qty = qty;
		this.price = price;
		this.brwcopies = brwcopies;
	}
	
	
	@Override
	public String toString() {
		return "Book [Book name=" + name + ", Book author=" + author + ", Book publisher=" + publisher + ", Book collection address=" + address
				+ ", qty=" + String .valueOf(qty) + ", price=" + String.valueOf(price) + ", Borrowing copies=" + String.valueOf(brwcopies) + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBrwcopies() {
		return brwcopies;
	}

	public void setBrwcopies(int brwcopies) {
		this.brwcopies = brwcopies;
	}
	
	
	
	
	
	
}
