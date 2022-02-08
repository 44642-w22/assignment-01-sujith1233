package problem7;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class problem7 {
	public static void main(String[] args) {
		Scanner scan7 = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int queueSize= scan7.nextInt();
		System.out.println("Enter input Queue elements");
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 0; i < queueSize; i++) {
			int s = scan7.nextInt();
			Q.add(s);
		}
		int n = getDecimalNumber(Q);
		System.out.println(n);
	}

	public static int getDecimalNumber(Queue Q) {
		int n = 0;
		int size = Q.size();
		size--;
		int base = 2;
		while (!Q.isEmpty()) {
			int e = (int) Q.poll();
			n = n + (e * (int) Math.pow(base, size));
			size--;
		}
		return n;
	}

}


