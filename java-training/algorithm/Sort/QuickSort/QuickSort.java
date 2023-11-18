import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = new int[500000]; // 10 million element sorted in (36 second)

		for (int a = 0; a < arr.length; a++) {
			arr[a] = random.nextInt(10000);
		}
	}

	public static void quickSort(int arr[], int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}

		int pivot = arr[highIndex];

		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {
			while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			swap(arr, leftPointer, rightPointer);
		}

		swap(arr, leftPointer, highIndex);

		quickSort(arr, lowIndex, leftPointer - 1);
		quickSort(arr, leftPointer + 1, highIndex);

	}

	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}