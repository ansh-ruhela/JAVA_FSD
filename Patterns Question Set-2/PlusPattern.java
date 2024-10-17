class PlusPattern
{
    static void printPattern(int n) {
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
			if (i == (n - 1) / 2 || j == (n - 1) / 2) {
				System.out.print(" + ");
			} else {
				System.out.print("   ");
			}
			col(i, j + 1, n);
		}
		return;
	}

	public static void main(String[] args) {
		System.out.print("Enter height of plus (for better view h >= 5) : ");
		int n = new java.util.Scanner(System.in).nextInt();

		if (n % 2 == 0) {
			n++;
		}
		printPattern(n);
	}
}