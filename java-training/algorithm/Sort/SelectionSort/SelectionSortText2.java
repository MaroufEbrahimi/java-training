public class SelectionSort2 {

	public static void main(String[] args) {
		String[] names = { "nabi", "moahmmad", "marouf", "ali", "zobir", "ahmad" };
		for (String name : names) {
			System.out.print(name + ",");
		}
		System.out.println();
		selectionSort(names);
		for (String name : names) {
			System.out.print(name + ",");
		}
	}

	public static void selectionSort(String[] names) {
		int n = names.length;
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (names[j].compareTo(names[minIndex]) < 0) {
					minIndex = j;
				}
			}
			String temp = names[i];
			names[i] = names[minIndex];
			names[minIndex] = temp;
		}
	}

}