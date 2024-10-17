
public class HollowDiamondPattern {
	static void printPattern(int n) {
		row1(0, n);
		row2(0, n);
	}

	static void row1(int i, int n)
	{
		if (i < n) {
			star(0, n - i);
			space(n - i, n);
			space(n - i, n);
			star(0, n - i);
			System.out.println();
			row1(i + 1, n);
		}
		return;
	}

	static void row2(int i, int n) {
		if (i < n) {
			star(0, i + 1);
			space(0, n - i - 1);
			space(0, n - i - 1);
			star(0, i + 1);
			System.out.println();
			row2(i + 1, n);
		}
		return;
	}

	static void space(int k, int n) {
		if (k < n) {
			System.out.print(" ");
			space(k + 1, n);
		}
		return;
	}

	static void star(int j, int n)
	{
		if (j < n) {
			System.out.print("*");
			star(j + 1, n);
		}
		return;
	}

	public static void main(String[] args) {
		System.out.print("Enter height of diamond (for better view h >= 5) : ");
		printPattern(new java.util.Scanner(System.in).nextInt());
	}
}
