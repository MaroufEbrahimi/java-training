
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
	
	
}

