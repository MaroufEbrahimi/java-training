
public class CircularQueueDemo {
	public static void main(String[] args) {
		CircularQueue cir = new CircularQueue(6);
		cir.insert(34);
		cir.insert(64);
		cir.insert(340);
		cir.insert(394);
		cir.insert(55);
		cir.insert(77);
		System.out.println(cir.remove());
		System.out.println(cir.remove());
		System.out.println(cir.remove());
		cir.insert(5);
		cir.insert(6);
		cir.insert(7);
		
		while(!cir.isEmpty()) {
			int rem = cir.remove();
			System.out.print(rem+" ");
		}
		System.out.println();
		
		
		
	}
}