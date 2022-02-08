package problem6;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class problem6 {


	public static void main(String[] args) {
		Scanner scan6 = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int stackSize=scan6.nextInt();
		System.out.println("Enter input stack elements");
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < stackSize; i++) {
			int s = scan6.nextInt();
			st.push(s);
		}
		List<Integer> A = getList(st);
		System.out.println(A);
	}

	public static List<Integer> getList(Stack S) {
		List<Integer> A = new ArrayList<>();
		int size = S.size();
		for (int i = 0; i < size / 2; i++) {
			A.add((Integer) S.pop());
		}
		List<Integer> temporaryList = new ArrayList<>();
		for (int i = size / 2; i < size; i++) {
			temporaryList.add((Integer) S.pop());
		}
		Collections.reverse(temporaryList);
		A.addAll(temporaryList);
		return A;
	}

}



