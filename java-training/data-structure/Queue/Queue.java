
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
			//maxSize++;
			res = true;
		}
		return res;
	}

	
}