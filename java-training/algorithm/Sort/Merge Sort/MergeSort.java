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

}
