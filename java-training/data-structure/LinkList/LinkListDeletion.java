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

	// Deleting a Node from specific position on the list
	public void deleteSpecificPosition(int position) {
		if (position == 1) {
			first = first.next;
		} else {
			Node prev = first;
			int count = 1;
			while (count < position - 1) {
				prev = prev.next;
				count++;
			}
			Node current = prev.next;
			prev.next = current.next;
		}
	}

	public static void main(String[] args) {
		LinkListDeletion deletion = new LinkListDeletion();
		deletion.deleteFirst();
		deletion.deleteLast();
		deletion.deleteSpecificPosition(4);
	}

}
