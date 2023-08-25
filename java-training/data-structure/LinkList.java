public class LinkList {

	private Node first;

	// Insertion of the first list
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = first;
		first = newNode;
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
		linklist.display();
	}

}
