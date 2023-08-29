package Tutorials;

import java.util.Arrays;
import java.util.LinkedList;

public class ConverLitsToArray {

	public static void main(String[] args) {
		// Converting array to list
		String[] names = { "Ahmad", "Ali", "Nabi", "Sonia" };
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(names));

		list.add("Massoud");
		list.addFirst("Marouf");

		// Covert back to Array
		names = list.toArray(new String[list.size()]);
		
		// Printing the Array
		for (String x : names) {
			System.out.print(x + ", ");
		}
	}

}
