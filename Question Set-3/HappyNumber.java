
import java.util.Scanner;

public class HappyNumber {
	public static int sumSquareDigit(int n) {
		int res = 0;
		int d;
		while (n > 0) {
			d = n % 10;
			res += d * d;
			n /= 10;
		}
		return res;
	}

	public static void main(String[] args) {
		int slow, fast;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		slow = sumSquareDigit(n);
		fast = sumSquareDigit(sumSquareDigit(n));
		boolean flag = false;
		while (slow != fast) {
			slow = sumSquareDigit(slow);
			fast = sumSquareDigit(sumSquareDigit(fast));
			if (fast == 1) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(n + " is a happy number");
		} else {
			System.out.println(n + " is not a happy number");
		}

	}

}