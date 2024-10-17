public class RightRhombusPattern
{
    static void printPattern(int n) {
		row(0, n);
	}

	private static void row(int i, int n) {
		if (i < n) {
			space(n - i, n);
			star(0, n);
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
		for (int i = 0; i < n; i++)
		{

			for (int k = n - i; k < n; k++) {
				System.out.print(" ");
			}


			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		printPattern(n);
	}
}