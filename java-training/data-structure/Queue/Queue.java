
public class Queue {

	private int maxSize;
	private int[] arr;
	private int front;
	private int rear;
	private int size;

	// Queue Constructor and Initialization some value
	public Queue(int s) {
		maxSize = size;
		arr = new int[maxSize];
		front = 0;
		rear = -1;
		size = 0;
	}

	// Create a function for inserting at the end of Queue (rear)
	public void insert(int data) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot insert new data.");
			return;
		}
		rear = (rear + 1) % maxSize; // Circular increment
		arr[rear] = data;
		size++;
	}

	// Removing a value at the front of Queue
	public int remove() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty. Cannot remove data.");
		}
		int data = arr[front];
		front = (front + 1) % maxSize; // Circular increment
		size--;
		return data;
	}

	// Finding the front of element
	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty. Cannot peek.");
		}
		return arr[front];
	}

	// When the Queue is empty
	public boolean isEmpty() {
		return (size == 0);
	}

	// When the Queue is Full
	public boolean isFull() {
		return size == maxSize;
	}

	// Finding the size of Queue
	public int getSize() {
		return size;
	}

	// displaying all elements of Queue
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[(front + i) % maxSize] + " ");
		}
		System.out.println();
	}

}