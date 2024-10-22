import java.util.Scanner;

public class KRotate
{   

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
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter rotation factor r : ");
        int r = sc.nextInt();
        System.out.println(n+" after "+r+" rotations = "+ rotate(n, r));
    }   
}