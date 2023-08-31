public class LinkListDeletion {

	private Node first;

	// Deleting first Node of the list
	public Node deleteFirst() {
		if (first == null)
			return null;

		Node temp = first;
		first = first.next;
		return temp;
	}

	// Deleting last Node of the list
	public Node deleteLast() {
		if (first == null || first.next == null) {
			return first;
		}

		Node current = first;
		Node prev = null;
		while (current.next != null) {
			prev = current;
			current = current.next;
		}

		prev.next = null;
		return current;
	}

	public static void main(String[] args) {
		LinkListDeletion deletion = new LinkListDeletion();
		deletion.deleteFirst();
		deletion.deleteLast();
	}

}
