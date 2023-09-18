
public class EqualTutorial {

	public static void main(String[] args) {

		// #--- The real different of equal() method and = -----#

		int a = 7;
		int b = 7;
		// the integer number are not reference the memory location
		// because they are primitive data type (like)
		// byte, short, int, long, float, double, char, boolean
		// the result of this code is => The numbers are Equal
		if (a == b) {
			System.out.println("The numbers are Equal");
		} else {
			System.out.println("The numbers are not Equal");
		}

		// String
		String str1 = new String("hi");
		String str2 = new String("hi");
		// the memory location of string are not equal
		// the result of this code is => The string are not Equal
		if (str1 == str2) {
			System.out.println("The string are Equal");
		} else {
			System.out.println("The string are not Equal");
		}

		// string using equal() method
		// the result of this code is => The string are Equal
		if (str1.equals(str2)) {
			System.out.println("The string are Equal");
		} else {
			System.out.println("The string are not Equal");
		}

		// String (no use the object String)
		// the result of this code is => The string are Equal
		String string1 = "hi";
		String string2 = "hi";
		if (string1 == string2) {
			System.out.println("The string are Equal");
		} else {
			System.out.println("The string are not Equal");
		}
	}

}
