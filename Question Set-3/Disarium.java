import java.util.Scanner;

public class Disarium {
	public static int count(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
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
			return b * pow(b, p - 1);
		}
	}

	public static boolean isDisarium(int n) {
		boolean status = false;
		int sum = 0;
		int pow = count(n);
		int num;
		int temp = n;
		while (n > 0) {
			num = n % 10;
			System.out.print("" + num + "^" + pow + " + ");
			sum += pow(num, pow--);
			n /= 10;
		}
		System.out.println("\b\b= " + sum);
		if (temp == sum) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if Disarium or not : ");
		int n = sc.nextInt();

		System.out.println(isDisarium(n));
	}
}
