public class LinkList {

	private Node first;

	// Insertion of the first list
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = first;
		first = newNode;
	}

	// Insertion at the end of list
	public void insertLast(int data) {
		Node newNode = new Node(data);
		if (first == null) {
			first = newNode;
			return;
		}
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	// Displaying elements of the list
	public void display() {
		Node current = first;
		System.out.print("first --> ");
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		LinkList linklist = new LinkList();
		linklist.insertFirst(5);
		linklist.insertLast(9);
		linklist.display();
	}

}
