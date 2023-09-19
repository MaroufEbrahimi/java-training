package semester_4;

public class TowerOfHanoiGame {

	public static void main(String[] args) {
		// The game consists of a board with three vertical pegs labeled A, B, and C, 
		// and a sequence of n disks with holes in their centers.
		// and it has three keys source, auxiliary, destination.
		towerOfHanoi(6, 'A', 'B', 'C');
	}

	public static void towerOfHanoi(int n, char src, char aux, char dest) {
		// Basis
		if (n == 1) {
			System.out.println(src + " -> " + dest);
			return;
		}

		// Recursive parts
		towerOfHanoi(n - 1, src, dest, aux);
		towerOfHanoi(1, src, aux, dest);
		towerOfHanoi(n - 1, aux, src, dest);
	}

}
