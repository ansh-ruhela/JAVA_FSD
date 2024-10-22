import java.util.Scanner;

public class PalindromeRotate {

	public static void isPalindromeRotate(int n) {
		int count = count(n);
		int temp;
		for (int i = 0; i < count; i++) {
			temp = rotate(n, i);
			System.out.println("value of n = " + n + " rotation " + i + " after rotation = " + temp);
			if (temp == reverse(temp)) {
				System.out.println("Palindrome after " + i + " rotations of " + n);
				return;
			}
		}
	}

	public static int reverse(int n) {
		int rev = 0;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		return rev;
	}

	public static int count(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static int pow(int b, int p) {
		if (p <= 0) {
			return 1;
		}
		if (p == 1) {
			return b;
		} else {
			return b * pow(b, --p);
		}
	}

	public static int rotate(int n, int r) {
		int c = count(n);
		if (r < 0) {
			r = r % c;
			r += c;
		}
		if (r == 0 || r == c) {
			return n;
		}
		int a = n % pow(10, r) * pow(10, c - r);
		int b = n / pow(10, r);
		return a + b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if Palindrome after n-1 rotations : ");
        int num = sc.nextInt();
        isPalindromeRotate(num);
	}
}
