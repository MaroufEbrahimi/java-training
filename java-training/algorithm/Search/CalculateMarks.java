package Semester_3;

public class CalculateMarks {
	

	public static void main(String[] args) {
		System.out.println("The result is: "+calcMark(50, 20, 70, 140));
	}
	
	public static double calcMark(double a1, double a2, double a3, double maxMark) {
		double total = a1 + a2 + a3;
		double mark = total / maxMark * 100;
		return mark;
	}

}
