
public class QueueByLinkedList {

	private QueueNode front;
	private QueueNode rear;
	private int len;

	private class QueueNode {
		private int data;
		private QueueNode next;

		public QueueNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public QueueByLinkedList() {
		this.front = null;
		this.rear = null;
		len = 0;
	}
	
	public int length() {
		return len;
	}

	public boolean isEmpty() {
		return len == 0;
	}
	
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

	public static void main(String[] args) {

	}
}