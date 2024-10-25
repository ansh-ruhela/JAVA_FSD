
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Keith {
	public static int count(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	public static int sumDigit(int digit) {
		int result = 0;
		while (digit > 0) {
			result += digit % 10;
			digit /= 10;
		}
		return result;
	}

	public static void generateSeries(int n, int t) {
		Deque<Integer> queue = new LinkedList<>();
		t = t - count(n) - 1;
		queue.addLast(sumDigit(n));
		while (n > 0) {
			queue.addFirst(n % 10);
			n /= 10;
		}
		queue.stream().forEach(e -> System.out.print(e + ", "));
		while (t > 0) {
			queue.addLast(2 * queue.getLast() - queue.pollFirst());
			System.out.print(queue.getLast() + ", ");
			t--;
		}
	}

	public static void main(String[] args) {
		int n = 197;
		int t = 10;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		n = sc.nextInt();
		System.out.print("Enter how many terms to print : ");
		t = sc.nextInt();
		generateSeries(n, t);
//		System.out.println(sumDigit(1, 2, count(123654)));
	}
}
