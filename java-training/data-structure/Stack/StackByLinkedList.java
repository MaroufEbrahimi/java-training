
import java.util.EmptyStackException;

public class StackByLinkedList {

	private StackNode top;
	private int size;

	private class StackNode {
		private int data;
		private StackNode next;

		public StackNode(int data) {
			this.data = data;
		}
	}

	public StackByLinkedList() {
		top = null;
		size = 0;
	}

	public int length() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void push(int data) {
		StackNode temp = new StackNode(data);
		temp.next = top;
		top = temp;
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		int res = top.data;
		top = top.next;
		size--;
		return res;
	}

	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	public static void main(String[] args) {
		StackByLinkedList stack = new StackByLinkedList();
		stack.push(2);
		stack.push(4);
		stack.push(6);

		System.out.println("The top Element is: " + stack.peek());
		stack.pop();
		System.out.println("The top Element is: " + stack.peek());
		stack.push(8);
		System.out.println("The top Element is: " + stack.peek());
	}

}
