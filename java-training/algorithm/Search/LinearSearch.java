package Semester_3;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 23, 8, 3, 9 };
		System.out.println(linearSearch(8, arr));
	}

	// public static int linearSearch(int[] list, int key) {

	public static int linearSearch(int a, int... list) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == a)
				return i;
		}
		return 0;
	}

}
