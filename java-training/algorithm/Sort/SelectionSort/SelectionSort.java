public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 34, 6, 1, 12, 4, 0, 2, 23, 66, 90 };

		int i, min, j, temp, len = arr.length;
		// displaying before sorting
		for (i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// sorting all elements here
		for (i = 0; i < len; i++) {
			min = i;
			for (j = i + 1; j < len; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		// displaying after sorting
		for (i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}