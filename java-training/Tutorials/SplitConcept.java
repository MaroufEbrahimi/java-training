package practice;

public class SplitConcept {

	public static void main(String[] args) {
		// split method
		String str = "s t r";
		// remove all space
		String arr[] = str.split(" ");
		for (String string : arr) {
			System.out.print(string); // output --> str
		}
		System.out.println("\n");
		// limit
		String str2 = "welcome-to-famous-java-programming";
		String arr2[] = str2.split("-", 3);
		for (String string : arr2) {
			System.out.print(string);
		}

		// how to change time string in Integer
		String str3 = new String("1/27/2024");
		String month[] = str3.split("/");
		System.out.println();
		int mon = 0, day = 0, year = 0;
		for (int i = 0; i < month.length; i++) {
			mon = Integer.parseInt(month[0]);
			day = Integer.parseInt(month[1]);
			year = Integer.parseInt(month[2]);
		}
		System.out.println("month: " + mon);
		System.out.println("day: " + day);
		System.out.println("year: " + year);

		// limit by 0
		System.out.println("\n");
		String str4 = "_f_a_m_o_u_s_";
		String arr4[] = str4.split("_", 0);
		for (String string : arr4) {
			System.out.print(string);
		}

		// limit by -1
		System.out.println("\n");
		String str5 = "_f_a_m_o_u_s_";
		String arr5[] = str5.split("_", -1);
		for (String string : arr5) {
			System.out.print(string);
		}
	}

}
