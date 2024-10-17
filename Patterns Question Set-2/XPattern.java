class XPattern
{
    
	static void printPattern(int n) {
		row(0, n);
	}

	private static void row(int i, int n) {
		if (i < n) {
			col(i, 0, n);
			System.out.println();
			row(i + 1, n);

		}
		return;
	}

	private static void col(int i, int j, int n) {
		if (j < n) {
			if (i == j || i + j == n - 1) {
				System.out.print("x");
			} else {
				System.out.print(" ");
			}
			col(i, j + 1, n);
		}
		return;
	}

	public static void main(String[] args) {
		System.out.print("enter height of X (for better view h >= 5) : ");
		int n = new java.util.Scanner(System.in).nextInt();
		printPattern(n);
	}
}
