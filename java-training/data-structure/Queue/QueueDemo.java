
public class QueueDemo {
	public static void main(String[] args) {
		var q = new Queue(5);
		q.insert(40);
        q.insert(50);
        q.insert(60);
        
        q.display(); // Expected output: 40 50 60 
        q.remove();
        q.display(); // Expected output: 50 60 
	}
}