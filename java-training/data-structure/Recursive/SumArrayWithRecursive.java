package semester_4;

public class SumArrayWithRecursive {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 20, 30 };
		System.out.println("The total of array is: " + sumArray(array, 0));
	}

	public static int sumArray(int nums[], int index) {
		// Another method
		// if (index >= nums.length)
		// return 0;
		if (index == nums.length - 1) { // basis part
			return nums[index];
		} else {
			return nums[index] + sumArray(nums, index + 1); // recursive part
		}
	}

}
