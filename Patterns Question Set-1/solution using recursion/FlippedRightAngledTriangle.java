class FlippedRightAngledTriangle
{
    static void printPattern(int n) {
		row(0, n);
	}

	private static void row(int i, int n) {
		if (i < n) {
			space(0, n - i - 1);
			star(0, i + 1);
			System.out.println();
			row(i + 1, n);
		}
		return;
	}

	private static void space(int k, int n) {
		if (k < n) {
			System.out.print(" ");
			space(k + 1, n);
		}
		return;
	}

	private static void star(int j, int n) {
		if (j < n) {

			System.out.print("*");
			star(j + 1, n);
		}
		return;
	}

	public static void main(String[] args)
	{
		System.out.print("Enter number of rows 'n' : ");
		int n = new java.util.Scanner(System.in).nextInt();
		printPattern(n);
	}
}