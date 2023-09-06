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
}