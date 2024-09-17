package sem3;

public class LinearSearchFind2Nums {

	public static void main(String[] args) {
		int nums[] = { 1, 3, 4, 5, 7 };
		int a = 4, b = 7;
		boolean con = search(nums, a, b);
		if (con == true) {
			System.out.println("Find the numbers");
		} else {
			System.out.println("Can't find numbers");
		}
	}

	public static boolean search(int a[], int f1, int f2) {
		boolean find_f1 = false;
		boolean find_f2 = false;
		for (int n : a) {
			if (n == f1) {
				find_f1 = true;
			}
			if(n == f2) {
				find_f2 = true;
			}
			
			if(find_f1 && find_f2) {
				return true;
			}
		}
		return false;
	}

}