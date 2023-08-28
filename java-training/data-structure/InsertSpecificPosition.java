package semester_4;

public class InsertSpecificPosition {

	private Node first;

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

	public void display() {
		Node current = first;
		System.out.print("First --> ");
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		InsertSpecificPosition isp = new InsertSpecificPosition();
		isp.insertSpecificPosition(1, 5);
		isp.insertSpecificPosition(2, 7);
		isp.display();
	}

}
