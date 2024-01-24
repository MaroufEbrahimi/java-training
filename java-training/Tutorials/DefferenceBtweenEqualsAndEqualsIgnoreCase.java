package practice;

public class DefferenceBtweenEqualsAndEqualsIgnoreCase {

	public static void main(String[] args) {
		// difference between equals & equalsIgnoreCase
		String str1 = new String("TEXT");
		String str2 = new String("text");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
