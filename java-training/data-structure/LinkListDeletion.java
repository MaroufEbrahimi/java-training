public class LinkListDeletion {

	private Node first;
	
	public Node deleteFirst() {
		if(first == null)
			return null;
		
		Node temp = first;
		first = first.next;
		return temp;
	}

	public static void main(String[] args) {

	}

}
