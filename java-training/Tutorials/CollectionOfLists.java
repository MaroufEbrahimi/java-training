package Tutorials;

import java.util.List;
import java.util.ArrayList;

public class CollectionOfLists {

	public static void main(String[] args) {
		String[] symbols = { "Ovel", "Parallerogram", "Rectangle", "Arrows" };
		List<String> list1 = new ArrayList<String>();
		for (String str1 : symbols) {
			list1.add(str1);
		}

		String[] symbols2 = { "Parallerogram", "Rectangle" };
		List<String> list2 = new ArrayList<String>();
		for (String str2 : symbols2) {
			list2.add(str2);
		}

		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}

}
