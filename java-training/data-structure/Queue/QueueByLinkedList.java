import java.util.NoSuchElementException;

public class QueueByLinkedList {
	
	// declaration of front, rear, len
	private QueueNode front;
	private QueueNode rear;
	private int len;

	// Creating a Node class
	private class QueueNode {
		private int data;
		private QueueNode next;

		public QueueNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// assign value for front & rear
	public QueueByLinkedList() {
		this.front = null;
		this.rear = null;
		len = 0;
	}

	// finding the length of Queue
	public int length() {
		return len;
	}

	// when the Queue is Empty
	public boolean isEmpty() {
		return len == 0;
	}

	// how to insert element at the end of Queue
	public void enqueue(int data) {
		var temp = new QueueNode(data);
		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		len++;
	}

	// finding Front
	public int first() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}

		return front.data;
	}

	// finding Rear
	public int last() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}

		return rear.data;
	}

	// how to delete element from the front of Queue
	public int dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}
		int res = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		len--;
		return res;
	}

	// displaying all elements of Queue
	public void display() {
		if (isEmpty()) {
			return;
		}

		QueueNode current = front;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		var q = new QueueByLinkedList();
		q.enqueue(10); // insert
		q.enqueue(34); // insert
		q.enqueue(20); // insert
		q.enqueue(64); // insert
		q.display(); // display
		q.dequeue(); // removing one element (front)
		q.display(); // display

		System.out.println("Front: " + q.first());
		System.out.println("Rear: " + q.last());
	}
}