package Semester_3;

public class LinearSearch2 {

	public static void main(String[] args) {
		int[] numbers = { 6, 7, 3, 0, 8, 3, 9, 8, 2, 0, 3 };

		int count = 0, key = 3;
		while (count < numbers.length) {
			if(numbers[count] == key) {
				System.out.println("The current index is: "+count);
			}
			count++;
		}
	}

}
