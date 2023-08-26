package Semester_3;
import java.util.*;
public class SumDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a numebr between 10 and 99");
		int num = in.nextInt();
		int res = sumDig(num);
		System.out.println("The res is: "+res);
	}
	
	public static int sumDig(int num) {
		int tens = num / 10;
		int ones = num % 10;
		int sum = tens + ones;
		return sum;
	}
}
