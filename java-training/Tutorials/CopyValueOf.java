public class CopyValueOf {

	public static void main(String[] args) {
		// concept of copyValueOf
		String str = "Hello";
		char[] abc = { 'j', 'a', 'v', 'a' };
		System.out.println(str);
		str = str.copyValueOf(abc);
		System.out.println(str);

		// 
		String str2 = "Hello";
		char[] abc2 = { 'j', 'a', 'v', 'a' };
		System.out.println(str2);
		str2 = new String(abc2);
		System.out.println(str2);
	}

}
