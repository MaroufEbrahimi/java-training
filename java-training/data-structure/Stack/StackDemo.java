
public class StackDemo {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Stack stack = new Stack(8);
		int i = 0;
		while (!stack.isFull()) {
			stack.push(arr[i++]);
		}

		System.out.println("Top of Stack : " + stack.peek());

		System.out.println("Stack elements : ");
		while (!stack.isEmpty()) {
			System.out.println(" " + stack.pop());
		}
	}
}