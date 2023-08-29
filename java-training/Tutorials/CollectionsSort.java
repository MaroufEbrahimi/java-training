package Tutorials;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsSort {

	public static void main(String[] args) {
		String[] names = { "Sonia", "Bashir", "Ali", "Nabi", "Ahmad" };
		List<String> li = Arrays.asList(names);
		Collections.sort(li);
		System.out.println(li + " ");

		Collections.sort(li, Collections.reverseOrder());
		System.out.println(li + " ");
	}

}
