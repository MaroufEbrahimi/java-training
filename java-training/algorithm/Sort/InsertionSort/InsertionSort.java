package Semester_3;

public class InsertionSort {

	public static void main(String[] args) {
		int list[] = { 1, 6, 3, 0, 12, 4, 3, 43, 44, 13, 43, 434 };
		System.out.println("Before Sorting:");
		for (int l : list) {
			System.out.format("%d, ", l);
		}

		long startTime = System.currentTimeMillis();
		int i, key, j;
		for (i = 1; i < list.length; i++) {
			key = list[i];
			j = i - 1;
			while (j >= 0 && list[j] > key) {
				list[j + 1] = list[j];
				j--;
			}
			list[j + 1] = key;
		}

		long endTime = System.currentTimeMillis();
		System.out.println("\nTime is: " + (endTime - startTime) + "ms");

		System.out.println("\nAfter Sorting:");
		for (int l : list) {
			System.out.format("%d, ", l);
		}
	}

}
