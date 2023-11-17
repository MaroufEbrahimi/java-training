package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 4, 1, 8, 0, 1, 2, 3, 4, 7, 8 };
		
	}


	public static void divide(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}

		int mid = start + (end - start) / 2;
		divide(arr, start, mid);
		divide(arr, mid + 1, end);
		conquer(arr, start, mid, end);
	}

	public static void conquer(int arr[], int start, int mid, int end) {
		int merge[] = new int[end - start + 1];

		int i1 = start;
		int i2 = mid + 1;
		int a = 0;

		while (i1 <= mid && i2 <= end) {
			if (arr[i1] <= arr[i2]) {
				merge[a++] = arr[i1++];
			} else {
				merge[a++] = arr[i2++];
			}
		}

		while (i1 <= mid) {
			merge[a++] = arr[i1++];
		}

		while (i2 <= end) {
			merge[a++] = arr[i2++];
		}
		
		// sorting elements
		for (int i = 0, j = start; i < merge.length; i++, j++) {
			arr[j] = merge[i];
		}
		
	}

}
