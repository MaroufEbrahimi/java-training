
public class Queue {

	private int maxSize;
	private int[] queueArray = new int[5];
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
	public void insert(int data) {
		queueArray[rear] = data;
		rear++;
		maxSize++;
	}

	// Removing a value at the front of Queue
	public int remove() {
		int data = queueArray[front];
		front++;
		maxSize--;
		return data;
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
	
	// displaying all elements of Queue
	public void display() {
		System.out.print("Elements: ");
		for (int i = 0; i < maxSize; i++) {
			System.out.print(queueArray[front + i] + " ");
		}
	}

}