package Enumeration;
import java.util.Arrays;
import java.util.EnumSet;

public class EnumerationSet {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(Answer.values()));
		
		System.out.println(Arrays.toString(EnumColor.values()));
		System.out.println(EnumColor.values().length);
		
		EnumSet<EnumColor> en = EnumSet.range(EnumColor.Black, EnumColor.Magenta);
		for(EnumColor a : en) {
			System.out.format("%s ", a);
		}
		
	}
}

enum Answer {yes, no}
