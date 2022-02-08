package problem9;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class problem9 {

	public static void main(String[] args) {
		Scanner scan9 = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int queueSize = scan9.nextInt();
		System.out.println("Enter the input Queue elements");
		Queue<Integer> Q = new ArrayDeque<>();
		for (int i = 0; i < queueSize; i++) {
			int s = scan9.nextInt();
			Q.add(s);
		}
		List<Integer> A = getEvenOdd(Q);
		System.out.println(A);
	}

	public static List<Integer> getEvenOdd(Queue<Integer> Q) {
		Queue<Integer> evenElementList = new LinkedList<>();
		Queue<Integer> oddElementList = new LinkedList<>();
		while (!Q.isEmpty()) {
			int s = Q.poll();
			if (s % 2 == 0) {
				evenElementList.add(s);
			} else {
				oddElementList.add(s);
			}

		}
		List<Integer> A = new ArrayList<>();
		while (!evenElementList.isEmpty() || !oddElementList.isEmpty()) {
			if (!evenElementList.isEmpty()) {
				A.add(evenElementList.poll());
			}
			if (!oddElementList.isEmpty()) {
				A.add(oddElementList.poll());
			}
		}
		return A;
	}

}
