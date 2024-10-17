import java.util.Scanner;
public class HollowSquarePattern
{
    static void printPattern(int n) {
		row(0, n);
	}

	private static void row(int i, int n)
	{
		if(i<n)
		{
			col(i, 0, n);
			System.out.println();
			row(i+1,n);
		}
		return;
	}

	private static void col(int i, int j, int n) {
		if (j < n) {
			if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
				System.out.print(" * ");
			} else {
				System.out.print("   ");
			}
			col(i, j + 1, n);
		}
		return;
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.print("Enter the value of n(number of rows) : ");
		n = new java.util.Scanner(System.in).nextInt();
		printPattern(n);
	}
}