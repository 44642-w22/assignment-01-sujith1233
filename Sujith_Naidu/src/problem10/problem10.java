package problem10;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class problem10 {
	public static void main(String[] args) {
		Scanner scan10 = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int dequeSize = scan10.nextInt();
		System.out.println("Enter input dq character elements");
		Deque<Character> D = new ArrayDeque<>();
		for (int i = 0; i <dequeSize ; i++) {
			char s = scan10.next().charAt(0);
			D.add(s);
		}
		System.out.println("Enter Array size");
		int arraySize= scan10.nextInt();
		List<Integer> A = new ArrayList<>();
		System.out.println("Enter the array Elements");
		for (int i = 0; i < arraySize; i++) {
			int x = scan10.nextInt();
			A.add(x);
		}
		String result = getDeque(D, A);
		System.out.println(result);
	}

	public static String getDeque(Deque<Character> D, List<Integer> A) {
		char y = '$';
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == 0) {
				;

				if (y != '$')
					D.addFirst(y);
			}
			if (A.get(i) == 1 && !D.isEmpty())
				y = D.pollFirst();
		}
		StringBuilder sb = new StringBuilder();
		while (!D.isEmpty()) {
			sb.append(D.poll());
		}
		return sb.toString();
	}

}

