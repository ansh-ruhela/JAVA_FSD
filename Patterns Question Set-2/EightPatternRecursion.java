
import java.util.Scanner;

public class EightPatternRecursion {

	static void printPattern(int n) {
		if (n % 2 == 0) {
			++n;
		}
		row(0, n);
	}

	static void row(int i, int n) {
		if (i < n) {
			col(i, 0, n);
			System.out.println();
			row(i + 1, n);
		}
		return;
	}

	static void col(int i, int j, int n) {
		if (j < n) {
			if (i == 0 || i == n - 1 || i == n / 2 || j == 0 || j == n - 1) {
				if ((i == 0 && j == 0) || (i == n / 2 && j == 0) || (i == n - 1 && j == 0) || (i == 0 && j == n - 1)
						|| (i == n / 2 && j == n - 1) || (i == n - 1 && j == n - 1)) {
					System.out.print(" ");
				} else if (j == 0 || j == n - 1) {
					System.out.print(":");
				} else {
					System.out.print("-");
				}
			} else {
				System.out.print(" ");
			}
			col(i, j + 1, n);
		}
		return;
	}
	public static void main(String[] args) {
		int n = 5;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n (for better view n >= 5) : ");
		n = sc.nextInt();
		printPattern(n);
		/*
		 * if (n % 2 == 0) { n++; } for (int i = 0; i < n; i++) { for (int j = 0; j < n;
		 * j++) { if (i == 0 || i == n - 1 || i == n / 2 || j == 0 || j == n - 1) { if
		 * ((i == 0 && j == 0) || (i == n / 2 && j == 0) || (i == n - 1 && j == 0) || (i
		 * == 0 && j == n - 1) || (i == n / 2 && j == n - 1) || (i == n - 1 && j == n -
		 * 1)) { System.out.print(" "); } else { System.out.print("X"); } } else {
		 * System.out.print(" "); } } System.out.println(); }
		 */
	}
}
