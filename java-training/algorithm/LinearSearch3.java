package Semester_3;

public class LinearSearch3 {

	public static void main(String[] args) {
		int linearArray[] = { 3, 7, 88, 55, 23, 12, 55, 66, 80, 90 };
		int key = 55;
		int i = 0;

		for (i = 0; i < linearArray.length; i++) {
			if (key == linearArray[i])
				break;
		}
		if (i < linearArray.length)
			System.out.println("found: " + (i + 1));
		else
			System.out.println("not found");
	}

}
