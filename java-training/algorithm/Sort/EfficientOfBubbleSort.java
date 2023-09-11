public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 34, 6, 1, 12, 4, 0, 2, 23, 66, 90 };

		System.out.println("Before Sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

		boolean flag = true;
		int len = arr.length - 1;
		while (len > 1 && flag) {
			flag = false;
			for (int j = 0; j < len; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			len = len - 1;
		}

		System.out.println("\n\nAfter Sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
