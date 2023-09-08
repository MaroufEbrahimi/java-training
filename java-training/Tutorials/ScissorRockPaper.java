
import java.util.Scanner;

public class ScissorRockPaper {

	public static void main(String[] args) {
		int ranNumber = (int) (Math.random() * 3);

		var input = new Scanner(System.in);

		System.out.print("Enter for SCISSOR(0), ROCK(1) and PAPER(2): ");
		int userNum = input.nextInt();

		if (ranNumber == 0) {
			if (userNum == ranNumber) {
				System.out.println("Computer is SCISSOR, you are SCISSOR too! it is a draw");
			} else {
				if (userNum == 1) {
					System.out.println("Computer is SCISSOR, you are ROCK. you won");
				}
				if (userNum == 2) {
					System.out.println("Computer is SCISSOR, you are PAPER. Computer won");
				}
			}
		} else if (ranNumber == 1) {
			if (userNum == ranNumber) {
				System.out.println("Computer is ROCK, you are ROCK too. it is a draw");
			} else {
				if (userNum == 0) {
					System.out.println("Computer is ROCK, you are SCISSOR. Computer won");
				}
				if (userNum == 2) {
					System.out.println("Computer is ROCK, you are PAPER. you won");
				}
			}
		} else {
			if (userNum == ranNumber) {
				System.out.println("Computer is PAPER, you are PAPER too. it is a draw");
			} else {
				if (userNum == 0) {
					System.out.println("Computer is PAPER, you are SCISSOR. you won");
				}
				if (userNum == 1) {
					System.out.println("Computer is PAPER, you are ROCK. Computer won");
				}
			}
		}
	}
}