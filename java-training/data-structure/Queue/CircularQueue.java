
public class CircularQueue {

	private int maxSize;
	private int[] queue;
	private int front;
	private int rear;
	private int items;

	public CircularQueue(int s) {
		maxSize = s;
		queue = new int[maxSize];
		front = -1;
		rear = -1;
		items = 0;
	}

	// inserting on Queue
	public void insert(int data) {
		if (rear == maxSize - 1) { // deal with wrap around
			rear = -1;
		}
		if (front == -1) {
			front = 0;
		}
		queue[++rear] = data;
		items++;
	}

	public int remove() {
		int temp = queue[front++];
		if (front == maxSize)
			front = 0;
		items--;
		return temp;
	}

	public int peek() {
		return queue[front];
	}

	public boolean isEmpty() {
		return (items == 0);
	}

	public boolean isFull() {
		return (items == maxSize);
	}

}
