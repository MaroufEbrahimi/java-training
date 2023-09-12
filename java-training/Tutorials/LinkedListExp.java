package Tutorials;
import java.util.LinkedList;

class Book {
	String name, auther, publisher;
	int id, quantity;

	public Book(int id, String name, String auther, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkedListExp {
	public static void main(String[] args) {
		// creating a list of Books
		LinkedList<Book> list = new LinkedList<Book>();
		var book1 = new Book(101, "Let us C", "Ali", "PPB", 8);
		var book2 = new Book(102, "Let us java", "Famous", "BPB", 8);

		list.add(book1);
		list.add(book2);

		for (Book bo : list) {
			System.out.println(bo.id + ", " + bo.name + ", " + bo.auther);
		}

	}
}