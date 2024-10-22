import java.util.Scanner;

public class Automorphic {
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

	public static boolean isAutomorphic(int n) {
		boolean status = false;
		int square = pow(n, 2);
		System.out.println("square of "+n+" is "+square);
		int count = count(n);
		System.out.println("no of digits in "+n+" is "+count);
		int lastDigit = square % pow(10, count);
		System.out.println("last digit of "+square+" is "+lastDigit);
		if (lastDigit == n) {
			status = true;
		}
		return status;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println(n + " is automorphic : " + isAutomorphic(n));
	}
}
