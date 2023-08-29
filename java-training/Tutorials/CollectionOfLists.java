package Tutorials;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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

		for (int i = 0; i < list1.size(); i++) {
			System.out.format("%s, ", list1.get(i));
		}
		
		editList(list1, list2);
		System.out.println();
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.format("%s, ", list1.get(i));
		}
	}

	private static void editList(Collection<String> li1, Collection<String> li2) {
		 Iterator<String> iter = li1.iterator();
		 
		 while(iter.hasNext()) {
			 if(li2.contains(iter.next())) {
				 iter.remove();
			 }
		 }
	}

}
