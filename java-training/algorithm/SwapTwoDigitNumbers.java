package Semester_3;

import java.util.Scanner;

public class SwapTwoDigitNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a two digite number");
		int num = in.nextInt();

		System.out.println("Before Swaping: " + num);
		System.out.println("After Swaping: " + swap(num));
	}

	public static int swap(int num) {
		int x = num / 10;
		int y = num % 10;
		int temp = x;
		x = y;
		y = temp;
		String str = x+""+y;
		int res = Integer.parseInt(str);
		return res;
	}

}
