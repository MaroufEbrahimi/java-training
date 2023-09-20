package semester_4;

public class Fibonacci {

	public static void main(String[] args) {
		// Finding Fibonacci 8 numbers
		System.out.println("Fibonacci: " + fib(8));
	}

	// The Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, …
	// Each number after the second is the sum of the two preceding numbers.
	public static int fib(int n) {
		if (n < 2)
			return n; // basis (is what stops the recursion)

		return fib(n - 1) + fib(n - 2); // recursive part (is where the function calls itself)
	}

}
