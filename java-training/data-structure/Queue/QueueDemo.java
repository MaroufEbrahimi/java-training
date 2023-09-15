
public class QueueDemo {
	public static void main(String[] args) {
		var q = new Queue();
		q.insert(4);
		q.insert(67);
		q.insert(6767);

		q.display();

		q.remove();
		q.display();
	}
}