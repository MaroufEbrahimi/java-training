package Semester_3;

public class BinarySearch {

	public static void main(String[] args) {
		// when using Binary Search the array must be sorted!
		int arr[] = { 4, 8, 12, 15, 24, 55, 67, 89, 90, 120, 230 };
		int res = binary(arr, 0, arr.length - 1, 89);
		if (res >= 0)
			System.out.println("Found in index: " + res);
		else
			System.out.println("Not Found");
	}

	public static int binary(int array[], int fir, int len, int key) {
		if (len >= fir) {
			int mid = (len + fir) / 2;
			if (array[mid] == key)
				return mid;
			else if (array[mid] < key)
				return binary(array, mid + 1, len, key);
			else
				return binary(array, fir, mid - 1, key);
		} else
			return -1;
	}

}
