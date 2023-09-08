
import java.util.Scanner;

public class ScissorRockPaper {

	public static void main(String[] args) {

		int randomNum = (int) (Math.random() * 3);

		var input = new Scanner(System.in);
		System.out.println("Enter scissor(0), rock(1), paper(2): ");
		int num = input.nextInt();

		if (randomNum == 0) {
			if (num == randomNum) {
				System.out.println("Computer is scissor, you are scissor too! it is a draw");
			} else {
				if (num == 1) {
					System.out.println("Computer is scissor, you are ROCK. you won");
				}
				if (num == 2) {
					System.out.println("Computer is scissor, you are PAPER. Computer won");
				}
			}
		}
	}
}