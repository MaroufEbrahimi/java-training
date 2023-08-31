package Tutorials;

import java.text.NumberFormat;

public class NumberFormatter {

	public static void main(String[] args) {
		int num = 10203040;
		NumberFormat formatter = NumberFormat.getInstance();
		System.out.println(formatter.format(num));
	}

}
