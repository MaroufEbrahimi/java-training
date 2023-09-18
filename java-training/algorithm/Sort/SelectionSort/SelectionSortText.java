
public class SelectionSortText {

	public static void main(String[] args) {
		String[] names = { "nabi", "moahmmad", "marouf", "ali", "zobir", "ahmad" };
		for (String name : names) {
			System.out.print(name + ", ");
		}
		System.out.println();

		for (String name : names) {
			System.out.print(name + ", ");
		}
	}

	public static void selectionSort(String[] names) {
		int len = names.length;
		for (int i = 0; i < len - 1; i++) {
			int min = i;
			for (int j = i + 1; j < len; j++) {
				if (isGreaterThan(names[j], names[min])) {
					min = j;
				}
			}
			String temp = names[i];
			names[i] = names[min];
			names[min] = temp;
		}
	}
	
	public static boolean isGreaterThan(String str1, String str2) {
		int minLen = Math.min(str1.length(), str2.length());
		for (int i = 0; i < minLen; i++) {
			if (str1.charAt(i) > str2.charAt(i)) {
				return false;
			} else if (str1.charAt(i) < str2.charAt(i)) {
				return true;
			}
		}
		return str1.length() > str2.length();
	}
}