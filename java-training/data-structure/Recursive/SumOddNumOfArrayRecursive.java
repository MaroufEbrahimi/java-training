package semester_4;

public class SumOddNumOfArrayRecursive {

	public static void main(String[] args) {
		int[] nums = { 5, 3, 3, 3, 5, 6, 7, 9 };
		System.out.println("Sum of the odd numbers in the array is: " + sumOfOdds(nums, 0));
	}

	public static int sumOfOdds(int[] arr, int index) {
		if (index >= arr.length)
			return 0;
		else {
			if (arr[index] % 2 == 1) {
				return arr[index] + sumOfOdds(arr, index + 1);
			} else {
				return sumOfOdds(arr, index + 1);
			}
		}
	}

}
