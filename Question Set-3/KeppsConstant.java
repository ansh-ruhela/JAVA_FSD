import java.util.Scanner;

public class KeppsConstant {
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

	public static int countZeros(int n) {
		int count = 0;
		while (n > 0) {
			if (n % 10 == 0) {
				count++;
			}
			n /= 10;
		}
		return count;
	}

	public static int getMaxDigit(int n) {
		int max = n % 10;
		n /= 10;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			n /= 10;
			if (rem > max) {
				max = rem;
			}
		}
		return max;
	}

	public static int getMinDigit(int n) {
		int min = n % 10;
		n /= 10;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			n /= 10;
			if (rem < min) {
				min = rem;
			}
		}
		return min;
	}

	public static int toAscendingOrder(int n) {
		int res = 0;
		int m;
		while (n > 0) {
			m = getMinDigit(n);
			res = res * 10 + m;
			n = remove(n, m);
		}
		return res;
	}

	public static int toDescendingOrder(int n) {
		int res = 0;
		int m;
		int zeros = countZeros(n);

		while (n > 0) {
			m = getMaxDigit(n);
			res = res * 10 + m;
			n = remove(n, m);

		}

		return res * pow(10, zeros);
	}

	public static int remove(int num, int n) {

		int res = 0;
		int rem;
		int count = 0;
		boolean flag = true;
		while (num > 0) {
			rem = num % 10;
			num /= 10;
			if (rem == n && flag) {
				flag = false;
				continue;
			}
			res = res + rem * pow(10, count++);
		}
		return res;
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


	public static void main(String[] args) {

		int n = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        n  = sc.nextInt();
		int a, d;
		for (int i = 0; i < 4; i++) {
			a = toAscendingOrder(n);
			d = toDescendingOrder(n);
			System.out.println("value of n -> "+n + ", ascending order -> " + a + ", descending order -> " + d);
			n = d - a;
			// System.out.println(n);
		}
	}
}
