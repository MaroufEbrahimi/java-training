public class LinkListInsertion {

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

	// Insertion at the specific position
	public void insertSpecificPosition(int position, int data) {
		Node newNode = new Node(data);

		if (position == 1) {
			newNode.next = first;
			first = newNode;
		} else {
			Node prev = first;
			int count = 1;

			while (count < position - 1) {
				prev = prev.next;
				count++;
			}

			Node current = prev.next;
			prev.next = newNode;
			newNode.next = current;
		}
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
		LinkListInsertion linklist = new LinkListInsertion();
		linklist.insertFirst(5);
		linklist.insertLast(9);
		linklist.insertSpecificPosition(3, 5);
		linklist.insertSpecificPosition(4, 11);
		linklist.insertSpecificPosition(1, 2);
		linklist.display();
	}

}
