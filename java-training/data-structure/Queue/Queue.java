
public class Queue {

	private int size;
	private int[] queueArray;
	private int front;
	private int rear;

	// Queue Constructor and Initialization some value
	public Queue(int s) {
		size = s;
		queueArray = new int[size];
		front = -1;
		rear = -1;
	}

	// Create a function for inserting at the end of Queue (rear)
	public boolean insert(int data) {
		boolean res = false;
		if (rear != queueArray.length - 1) {
			queueArray[++rear] = data;
			// size++;
			res = true;
		}
		return res;
	}

	// Removing a value at the front of Queue
	public int remove() {
		int res = 0;
		if (size != 0) {
			front++;
			res = queueArray[front];
			size--;
		}
		return res;
	}

	// Finding the front of element
	public int peek() {
		int res = 0;
		if (!isEmpty()) {
			res = queueArray[front + 1];
		}
		return res;
	}

	// When the Queue is empty
	public boolean isEmpty() {
		return (size == 0);
	}

	// Finding the size of Queue
	public int getSize() {
		return size;
	}

}