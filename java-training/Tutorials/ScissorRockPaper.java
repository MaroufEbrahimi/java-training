
import java.util.Scanner;

public class ScissorRockPaper {

	public static void main(String[] args) {

		int randomNum = (int) (Math.random() * 3);

		var input = new Scanner(System.in);
		System.out.println("Enter scissor(0), rock(1), paper(2): ");
		int num = input.nextInt();
	}
}