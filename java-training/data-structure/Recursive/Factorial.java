package semester_4;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial number: " + fac(5));
	}

	public static int fac(int n) {
		if (n == 0)
			return 1; // basis (is what stops the recursion)

		return n * fac(n - 1); // recursive part (is where the function calls itself)
	}
}
