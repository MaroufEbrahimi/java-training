import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = new int[500000]; // 10 million element sorted in (36 second)

		for (int a = 0; a < arr.length; a++) {
			arr[a] = random.nextInt(10000);
		}
	}

}