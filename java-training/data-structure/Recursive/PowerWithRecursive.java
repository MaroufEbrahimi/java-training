package semester_4;

public class PowerWithRecursive {

	public static void main(String[] args) {
		int base = 2, power = 4;
		System.out.println(base + " raised to the power of " + power + " is: " + power(base, power));
	}

	public static int power(int base, int pow) {
		if (pow == 0)
			return 1; // basis part
		else
			return base * power(base, pow - 1); // recursive part
	}

}
